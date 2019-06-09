package irvine.oeis.a023;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023586 Exponent of 2 in prime factorization of <code>2*p(n)-1</code>.
 * @author Sean A. Irvine
 */
public class A023586 extends A000040 {

  @Override
  public Z next() {
    final FactorSequence fs = Cheetah.factor(super.next().multiply2().subtract(1));
    return Z.valueOf(fs.getExponent(fs.toZArray()[0]));
  }
}
