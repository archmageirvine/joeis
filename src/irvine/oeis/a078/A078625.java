package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078625 Primes of the form 2*x^3 + 3*x^2 + 5*x + 7.
 * @author Sean A. Irvine
 */
public class A078625 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      final Z t = Z.TWO.multiply(++mN).add(3).multiply(mN).add(5).multiply(mN).add(7);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}

