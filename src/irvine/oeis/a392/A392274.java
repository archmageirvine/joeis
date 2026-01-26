package irvine.oeis.a392;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A392274 Number of length n words over the alphabet [5] such that any prefix satisfies #1 &gt;= #2, #1 &gt;= #3, #2 &gt;= #4, #3 &gt;= #5, and #4 &gt;= #5, where #i is the number of occurrences of the letter i.
 * @author Sean A. Irvine
 */
public class A392274 extends Sequence0 {

  // After Alois P. Heinz

  private int mN = -1;

  private final HashMap<String, Z> mB = new HashMap<>();

  private int[] decrement(final int[] l) {
    final int[] res = new int[l.length];
    for (int k = 0; k < l.length; ++k) {
      res[k] = l[k] - 1;
    }
    return res;
  }

  private Z computeB(final int n, final int[] l) {
    if (n == 0) {
      return Z.ONE;
    }
    Z t = Math.min(l[0], l[2]) > 0 ? b(n - 1, decrement(l)) : Z.ZERO;
    for (int j = 0; j < l.length; ++j) {
      ++l[j];
      if (l[0] <= l[1] && l[1] <= l[3] && l[2] <= l[3]) {
        t = t.add(b(n - 1, l));
      }
      --l[j];
    }
    return t;
  }

  private Z b(final int n, final int[] l) {
    final String key = n + Arrays.toString(l);
    final Z res = mB.get(key);
    if (res != null) {
      return res;
    }
    final Z b = computeB(n, l);
    mB.put(key, b);
    return b;
  }

  @Override
  public Z next() {
    return b(++mN, new int[4]);
  }
}
