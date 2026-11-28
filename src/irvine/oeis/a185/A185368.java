package irvine.oeis.a185;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001620;

/**
 * A185368 First n-digit square in the digits of Euler's constant (or the Euler-Mascheroni constant) gamma.
 * @author Sean A. Irvine
 */
public class A185368 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z mod = Z.TEN.pow(++mN);
    final Sequence gamma = new A001620();
    Z v = Z.ZERO;
    while (true) {
      v = v.multiply(10).add(gamma.next()).mod(mod);
      if (Predicates.SQUARE.is(v)) {
        return v;
      }
    }
  }
}

