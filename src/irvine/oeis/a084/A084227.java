package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084227 Numbers of the form p*q^k with distinct primes p and q, k&gt;0.
 * @author Sean A. Irvine
 */
public class A084227 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == 2 && Jaguar.factor(mN).minExponent() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
