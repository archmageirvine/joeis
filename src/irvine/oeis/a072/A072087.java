package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061712;

/**
 * A072033.
 * @author Sean A. Irvine
 */
public class A072087 extends Sequence1 {

  private final DirectSequence mSeq = DirectSequence.create(1, new A061712());
  private long mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(mSeq.a(p).pow(fs.getExponent(p)));
    }
    return prod;
  }
}
