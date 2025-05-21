package irvine.oeis.a279;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A279433 Triangle read by rows: T(n,k), n&gt;=k&gt;=1, is the number of right triangles with integral coordinates that have a bounding box of size n X k.
 * @author Sean A. Irvine
 */
public class A279433 extends Sequence1 {

  private long mN = 0;
  private long mM = 0;

  private String key(final long x0, final long y0, final long x1, final long y1, final long x2, final long y2) {
    final String[] t = new String[] {x0 + "," + y0, x1 + "," + y1, x2 + "," + y2};
    Arrays.sort(t);
    return Arrays.toString(t);
  }

  protected int t(final long n, final long k) {
    if (k == 1) {
      return 0;
    }
    // (x0,y0) = (0,0) WLOG one corner must be included
    // (x1,y1) = (j, k-1) for 0 <= j < n
    // (x2,y2) = (n-1, i) for 0 <= i < k
    // Probably a better way of dealing with symmetry than what is done here
    final long y1 = k - 1;
    final long x2 = n - 1;
    final Set<String> triangles = new HashSet<>();
    for (long x1 = 0; x1 < n; ++x1) {
      for (long y2 = 0; y2 < k; ++y2) {
        final long s1sq = y1 * y1 + x1 * x1;
        final long s2sq = y2 * y2 + x2 * x2;
        final long s3sq = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
        if (s3sq > 0) {
          if (s1sq + s2sq == s3sq || s1sq + s3sq == s2sq || s2sq + s3sq == s1sq) {
            triangles.add(key(0, 0, x1, y1, x2, y2));
            triangles.add(key(n - 1, 0, n - 1 - x1, y1, n - 1 - x2, y2));
            triangles.add(key(0, k - 1, x1, k - 1 - y1, x2, k - 1 - y2));
            triangles.add(key(n - 1, k - 1, n - 1 - x1, k - 1 - y1, n - 1 - x2, k - 1 - y2));
          }
        }
      }
    }
    //System.out.println(triangles);
    return triangles.size();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Z.valueOf(t(mN, mM));
  }
}
