package irvine.oeis.a080;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080758.
 * @author Sean A. Irvine
 */
public class A080773 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    final FactorSequence fs = Jaguar.factor(++mN);
    long cnt = 0;
    for (final Z p : fs.toZArray()) {
      cnt += (long) p.bitCount() * fs.getExponent(p);
    }
    return Z.valueOf(cnt);
  }
}
