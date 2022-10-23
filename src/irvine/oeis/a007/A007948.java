package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007948 Largest cubefree number dividing n.
 * @author Sean A. Irvine
 */
public class A007948 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long p = 1;
    final FactorSequence fs = Jaguar.factor(++mN);
    for (final Z d : fs.toZArray()) {
      p *= d.pow(Math.min(2, fs.getExponent(d))).longValue();
    }
    return Z.valueOf(p);
  }
}
