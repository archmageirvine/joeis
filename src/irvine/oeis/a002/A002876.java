package irvine.oeis.a002;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A002876 Number of weighted linear spaces of total weight n.
 * @author Sean A. Irvine
 */
public class A002876 extends Sequence1 implements Conjectural {

  // Correct to at least a(8) = 239.

  private static final class Point {
    int mWeight;

    private Point(final int weight) {
      mWeight = weight;
    }

    @Override
    public String toString() {
      return String.valueOf(mWeight);
    }
  }

  private int mN = 0;
  private final HashSet<String> mSpaces = new HashSet<>();
  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  private boolean isAdditionPermitted(final long[] lines, final long k) {
    // k is a vector indicating which lines we want to add a point to
    // but no line can share two (or more) points with another line.
    // Therefore, we check lines having intersections with k
    long j = k;
    for (int u = 0; u < lines.length; ++u, j >>>= 1) {
      if ((j & 1) == 1) {
        int v = u + 1;
        for (long i = j >>> 1; i != 0; i >>>= 1, ++v) {
          if ((i & 1) == 1 && (lines[u] & lines[v]) != 0) {
            return false;
          }
        }
      }
    }
    return true;
  }

  // Sorted list of the points on a line
  private String toString(final long line, final int[] counts, final Point[] points) {
    final String[] sl = new String[Long.bitCount(line)];
    long km = 1;
    for (int k = 0, j = 0; k < points.length; ++k, km <<= 1) {
      if ((line & km) != 0) {
        final int cnt = counts[k];
        if (cnt > 1) {
          sl[j++] = points[k].toString() + "{" + cnt + "}";
        } else {
          sl[j++] = points[k].toString();
        }
      }
    }
    Arrays.sort(sl);
    return Arrays.toString(sl);
  }

  private String toString(final long[] lines, final int[] counts, final Point[] points) {
    final String[] sl = new String[lines.length];
    for (int k = 0; k < lines.length; ++k) {
      sl[k] = toString(lines[k], counts, points);
    }
    Arrays.sort(sl);
    return Arrays.toString(sl);
  }

  private int[] lineCounts(final long[] lines, final Point[] points) {
    final int[] counts = new int[points.length];
    long km = 1L;
    for (int k = 0; k < points.length; ++k, km <<= 1) {
      int c = 0;
      for (final long line : lines) {
        if ((line & km) != 0) {
          ++c;
        }
      }
      counts[k] = c;
    }
    return counts;
  }

  private long firstUnusedBit(final long[] lines) {
    long bit = 1;
    for (int c = 0; c < lines.length; ++c, bit <<= 1) {
      if (lines[c] == 0) {
        return bit;
      }
    }
    return bit;
  }

  // When adding the new point, either we must use lines already used or
  // include a contiguous set of the next empty lines as part of the placement
  private boolean isOk(final long k, final long unused) {
    if (k < unused) {
      return true;
    }
    // Might be a faster way of doing the following, for bits >= unused
    // want to eliminate k with 0s to the left of unused by right of leading 1
    long j = unused;
    while (j <= k) {
      if ((j & k) == 0) {
        return false;
      }
      j <<= 1;
    }
    return true;
  }

  private void countWeightedLinearSpaces(final long[] lines, final Point[] points, final int currentPoint, final long minK) {
    if (currentPoint == points.length) {
      for (int k = 0; k < lines.length; ++k) {
        final long lk = lines[k];
        final int pop = Long.bitCount(lk);
        if (pop == 2) {
          // Lines with just two points not allowed
          return; // Illegal
        }
        if (pop == 1) {
          for (int j = 0; j < lines.length; ++j) {
            if (k != j && (lines[j] & lk) != 0) {
              // Isolated points must not be on another line
              return; // Illegal
            }
          }
        }
      }
      // I'm not convinced the following isomorphism test (or the above generation)
      // is sufficient for larger n, it does work up to at least n == 8
      final String strRep = toString(lines, lineCounts(lines, points), points);
      final boolean added = mSpaces.add(strRep);
      if (added && mVerbose) {
        System.out.println(strRep);
      }
      return;
    }

    // Add the point to each possible combination of existing lines,
    // allowing for the starting of a new line.  We use a binary
    // vector, k, to determine which lines a point is to be added to.
    final long startK = currentPoint == 0 || points[currentPoint - 1].mWeight == points[currentPoint].mWeight ? minK : 1;
    final long unused = firstUnusedBit(lines);
    final long limit = 1L << lines.length;
    final long bit = 1L << currentPoint;
    for (long k = startK; k < limit; ++k) {
      if (isOk(k, unused) && isAdditionPermitted(lines, k)) {
        int u = 0;
        for (long j = k; j != 0; ++u, j >>>= 1) {
          if ((j & 1) != 0) {
            lines[u] |= bit;
          }
        }
        countWeightedLinearSpaces(lines, points, currentPoint + 1, k);
        // Revert the added point
        for (int v = 0; v < lines.length; ++v) {
          lines[v] &= ~bit;
        }
      }
    }
  }

  private long countWeightedLinearSpaces(final Point[] points) {
    // Assign points to lines in all possible ways
    // Any two distinct points can be on at most one line
    mSpaces.clear();
    // The maximum number of lines is equal to the number of points
    // Represent each line by a bit vector indicating which points it contains
    final long[] lines = new long[points.length];
    countWeightedLinearSpaces(lines, points, 0, 1L);
    return mSpaces.size();
  }

  private long countWeightedLinearSpaces(final int[] p) {
    // p gives the weights of each of the points
    final Point[] points = new Point[p.length];
    for (int k = 0; k < p.length; ++k) {
      points[k] = new Point(p[k]);
    }
    return countWeightedLinearSpaces(points);
  }

  @Override
  public Z next() {
    final IntegerPartition part = new IntegerPartition(++mN);
//    if (mN == 9) {
//      System.out.println("WARNING: Values from this point on could be wrong due to isomorphism difficulties");
//    }
    long count = 0;
    int[] p;
    while ((p = part.next()) != null) {
      if (mVerbose) {
        System.out.println("Doing partition " + Arrays.toString(p));
      }
      count += countWeightedLinearSpaces(p);
    }
    return Z.valueOf(count);
  }

}
