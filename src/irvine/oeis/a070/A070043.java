package irvine.oeis.a070;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070043 Numbers of the form 6*j*k+j+k for positive integers j and k.
 * @author Sean A. Irvine
 */
public class A070043 extends Sequence1 {

  private Z mN = Z.SEVEN;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = mN.multiply(6).add(1);
      for (final Z d : Jaguar.factor(t).divisors()) {
        if (d.mod(6) == 1 && !d.equals(Z.ONE) && !d.equals(t)) {
          return mN;
        }
      }
    }
  }
}
