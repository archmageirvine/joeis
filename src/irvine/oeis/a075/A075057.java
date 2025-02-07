package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075057 a(1) = 0, then smallest triangular number such that a(n+1)- a(n) is a palindrome.
 * @author Sean A. Irvine
 */
public class A075057 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    Z t = Functions.TRINV.z(mA);
    while (true) {
      t = t.add(1);
      final Z s = Functions.TRIANGULAR.z(t);
      if (Predicates.PALINDROME.is(s.subtract(mA))) {
        mA = s;
        return s;
      }
    }
  }
}
