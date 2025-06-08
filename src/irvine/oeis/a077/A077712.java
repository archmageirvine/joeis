package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A077712 a(1) = 1, a(n) = the smallest squarefree number &gt; a(n-1) which contains all the digits of a(n-1).
 * @author Sean A. Irvine
 */
public class A077712 extends Sequence1 {

  private Z mA = null;

  private static boolean is(final int[] a, final Z t) {
    if (!Predicates.SQUARE_FREE.is(t)) {
      return false;
    }
    final int[] b = ZUtils.digitCounts(t);
    for (int k = 0; k < a.length; ++k) {
      if (b[k] < a[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    }
    if (mA.isOne()) {
      mA = Z.TEN;
      return Z.TEN;
    }
    final int[] cnts = ZUtils.digitCounts(mA);
    final Z t1 = mA.add(9);
    if (is(cnts, t1)) {
      mA = t1;
      return mA;
    }
    final Z t2 = Z.TEN.pow(Functions.DIGIT_LENGTH.l(mA)).add(1);
    if (is(cnts, t2)) {
      mA = t2;
      return mA;
    }
    final Z t3 = t2.add(9);
    if (is(cnts, t3)) {
      mA = t3;
      return mA;
    }
    throw new UnsupportedOperationException();
  }
}
