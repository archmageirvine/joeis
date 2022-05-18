package irvine.oeis.a003;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003960 Fully multiplicative with a(p) = [ (p+1)/2 ] for prime p.
 * @author Sean A. Irvine
 */
public class A003960 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.add(1).divide2().pow(fs.getExponent(p)));
    }
    return prod;
  }
}
