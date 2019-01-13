package irvine.oeis.a006;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006245.
 * @author Sean A. Irvine
 */
public class A006245 implements Sequence {

  // After Matthew J. Samuel

  private int mN = 0;
  private HashMap<String, Z> mCache = new HashMap<>();

  private Z classes(final int[] perm, final int spot, final int negs) {
    Z sums = Z.ZERO;
    boolean doneAny = false;
    for (int k = spot; k < perm.length - 1; ++k) {
      if (perm[k] > perm[k + 1]) {
        final int t = perm[k];
        perm[k] = perm[k + 1];
        perm[k + 1] = t;
        sums = sums.add(classes(perm).multiply(negs)).add(classes(perm, k + 2, -negs));
        perm[k + 1] = perm[k];
        perm[k] = t;
        doneAny = true;
      }
    }
    if (spot == 0 && !doneAny) {
      return Z.ONE;
    } else {
      return sums;
    }
  }

  private Z classes(final int[] perm) {
    final String key = Arrays.toString(perm);
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z c = classes(perm, 0, 1);
    mCache.put(key, c);
    return c;
  }

  @Override
  public Z next() {
    mCache.clear(); // throw away values that will never be used again
    final int[] perm = new int[++mN];
    for (int k = 0; k < mN; ++k) {
      perm[k] = mN - k;
    }
    return classes(perm);
  }

}
