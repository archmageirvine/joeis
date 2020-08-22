package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023593 Exponent of least prime factor of 2*prime(n)+1.
 * @author Sean A. Irvine
 */
public class A023593 extends A000040 {

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(super.next().multiply2().add(1));
    return Z.valueOf(fs.getExponent(fs.toZArray()[0]));
  }
}
