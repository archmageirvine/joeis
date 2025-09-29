package irvine.oeis.a387;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A387835 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A387835 extends Sequence2 {

  private long mN = 2;
  private int mE = 1;
  private long mK = 0;

  @Override
  public Z next() {
    if (++mK > mE) {
      mE = Jaguar.factor(++mN).maxExponent();
      mK = 1;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    Z m = Z.ONE;
    for (final Z p : fs.toZArray()) {
      final int f = fs.getExponent(p);
      m = m.multiply(p.pow(f / mK));
    }
    return m;
  }
}
