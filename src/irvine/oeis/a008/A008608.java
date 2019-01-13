package irvine.oeis.a008;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008608.
 * @author Sean A. Irvine
 */
public class A008608 implements Sequence {

  // After Alois P. Heinz

  private int mN = -1;
  private final HashMap<String, Z> mCache = new HashMap<>();

  private Z computeB(final int n, final int i, final int[] l) {
    if (l.length == 0) {
      return Z.ONE;
    } else {
      if (i == 0) {
        return b(l[0] + 1, l.length - 1, Arrays.copyOfRange(l, 1, l.length));
      } else {
        Z sum = Z.ZERO;
        for (int j = 0; j <= n; ++j) {
          l[i - 1] += j;
          sum = sum.add(b(n - j, i - 1, l));
          l[i - 1] -= j;
        }
        return sum;
      }
    }
  }

  private Z b(final int n, final int i, final int[] l) {
    final String key = n + "_" + i + Arrays.toString(l);
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z r = computeB(n, i, l);
    mCache.put(key, r);
    return r;
  }


  @Override
  public Z next() {
    return b(1, ++mN, new int[mN]);
  }
}
