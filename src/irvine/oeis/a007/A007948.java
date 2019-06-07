package irvine.oeis.a007;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007948 Largest cubefree number dividing <code>n</code>.
 * @author Sean A. Irvine
 */
public class A007948 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long p = 1;
    final FactorSequence fs = Cheetah.factor(++mN);
    for (final Z d : fs.toZArray()) {
      p *= d.pow(Math.min(2, fs.getExponent(d))).longValue();
    }
    return Z.valueOf(p);
  }
}
