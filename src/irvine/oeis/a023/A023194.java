package irvine.oeis.a023;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A023194 Numbers whose sum of divisors is prime.
 * @author Sean A. Irvine
 */
public class A023194 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 0) {
      mN = 1;
      return Z.TWO; // only nonsquare in the sequence
    }
    while (true) {
      final Z n2 = Z.valueOf(++mN).square();
      if (Functions.SIGMA.z(n2).isProbablePrime()) {
        return n2;
      }
    }
  }
}
