package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Triple;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * A003142 Largest subset of <code>3 X 3</code> X ... X 3 cube <code>(in n dimensions)</code> with no 3 points collinear.
 * @author Sean A. Irvine
 */
public class A003142 implements Sequence {

  private int mN = -1;
  private int mLimit = 1;
  private int mMax = 0;
  private List<List<Triple<Integer>>> mPointToLines = null;

  private Triple<Integer> line(int p, int q, int r) {
    if (q < p) {
      final int t = p;
      if (r < q) {
        p = r;
        r = t;
      } else {
        if (r < t) {
          p = q;
          q = r;
          r = t;
        } else {
          p = q;
          q = t;
        }
      }
    } else {
      if (r < q) {
        final int t = r;
        r = q;
        if (t < p) {
          q = p;
          p = t;
        } else {
          q = t;
        }
      }
    }
    return new Triple<>(p, q, r);
  }

  private boolean bump(final int[] delta) {
    for (int k = 0; k < delta.length; ++k) {
      if (++delta[k] <= 1) {
        return true;
      }
      delta[k] = -1;
    }
    return false;
  }

  private void pointToCoords(final int[] coords, int point) {
    for (int k = 0; k < coords.length; ++k) {
      coords[k] = point % 3;
      point /= 3;
    }
  }

  private int coordsToPoint(final int[] coords) {
    int p = 0;
    for (int k = 0, m = 1; k < coords.length; ++k, m *= 3) {
      p += m * coords[k];
    }
    return p;
  }

  private void add(final int[] coords, final int[] delta) {
    for (int k = 0; k < coords.length; ++k) {
      coords[k] += delta[k];
    }
  }

  private void subtract(final int[] coords, final int[] delta) {
    for (int k = 0; k < coords.length; ++k) {
      coords[k] -= delta[k];
    }
  }

  private boolean isValid(final int[] coords) {
    for (final int d : coords) {
      if (d < 0 || d > 2) {
        return false;
      }
    }
    return true;
  }

  private Collection<Triple<Integer>> constructLines() {
    // This over-generates the lines, but it is not the slow part of the overall problem
    final HashSet<Triple<Integer>> lines = new HashSet<>();
    final int[] delta = new int[mN];
    final int[] coords = new int[mN];
    for (int p = 0; p < mLimit; ++p) {
      pointToCoords(coords, p);
      Arrays.fill(delta, -1);
      do {
        add(coords, delta);
        if (isValid(coords)) {
          final int q = coordsToPoint(coords);
          if (p != q) {
            add(coords, delta);
            if (isValid(coords)) {
              final int r = coordsToPoint(coords);
              lines.add(line(p, q, r));
            }
            subtract(coords, delta);
          }
        }
        subtract(coords, delta);
      } while (bump(delta));
    }
    //System.out.println("Total lines " + lines.size());
    return lines;
  }

  private List<List<Triple<Integer>>> pointToLines(final Collection<Triple<Integer>> lines) {
    final List<List<Triple<Integer>>> pointToLines = new ArrayList<>(mLimit);
    for (int k = 0; k < mLimit; ++k) {
      pointToLines.add(new ArrayList<>());
    }
    for (final Triple<Integer> line : lines) {
      pointToLines.get(line.left()).add(line);
      pointToLines.get(line.mid()).add(line);
      pointToLines.get(line.right()).add(line);
    }
    return pointToLines;
  }

  private boolean isAllowed(final List<Triple<Integer>> lines, final boolean[] used) {
    for (final Triple<Integer> line : lines) {
      if (used[line.left()] && used[line.mid()] && used[line.right()]) {
        return false;
      }
    }
    return true;
  }

  private void search(final boolean[] used, final int position, final int countSoFar) {
    if (countSoFar > mMax) {
      mMax = countSoFar;
    }
    final int remaining = used.length - position;
    if (remaining + countSoFar <= mMax) {
      return; // short-circuit, even if we all remaining points we wont do better than existing solution
    }
    for (int k = position; k < mLimit; ++k) {
      used[k] = true;
      if (isAllowed(mPointToLines.get(k), used)) {
        search(used, k + 1, countSoFar + 1);
      }
      used[k] = false;
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    mLimit *= 3L;
    mPointToLines = pointToLines(constructLines());
    mMax = 0;
    // Assume (0,0,....,0) is used (I hope this is true). Can run without this assumption.
    // search(new boolean[mLimit], 0, 0);
    final boolean[] used = new boolean[mLimit];
    used[0] = true;
    search(used, 1, 1);
    return Z.valueOf(mMax);
  }

}

