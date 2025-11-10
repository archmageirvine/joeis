package irvine.oeis.a386;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A386704 allocated for Aloe Poliszuk.
 * @author Sean A. Irvine
 */
public class A386704 extends Sequence1 {

  private long mN = 0;

  private Z f(final FactorSequence fs, final long s1, final long s2, final long s3) {
    Z prod = Z.ONE;
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.pow(3).add(p.square().multiply(s1)).add(p.multiply(s2)).add(s3));
    }
    return prod;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    return f(fs, 1, 1, 1)
      .add(f(fs, 1, 1, -1))
      .add(f(fs, 1, -1, 1))
      .add(f(fs, 1, -1, -1))
      .add(f(fs, -1, 1, 1))
      .add(f(fs, -1, 1, -1))
      .add(f(fs, -1, -1, 1))
      .add(f(fs, -1, -1, -1))
      .divide(8);
  }
}
