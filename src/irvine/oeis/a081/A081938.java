package irvine.oeis.a081;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081938 a(1) = 1, a(n) = smallest palindromic number &gt; a(n-1) of the form k*a(n-1) - 1.
 * @author Sean A. Irvine
 */
public class A081938 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      long k = 1;
      while (true) {
        final Z t = mA.multiply(++k).subtract(1);
        if (Predicates.PALINDROME.is(t) && t.compareTo(mA) > 0) {
          mA = t;
          break;
        }
      }
    }
    return mA;
  }
}
