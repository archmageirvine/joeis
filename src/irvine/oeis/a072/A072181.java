package irvine.oeis.a072;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072181 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN > 1) {
      final FactorSequence fsn = Jaguar.factor(mN);
      final FactorSequence fsa = Jaguar.factor(mA);
      final HashSet<Z> done = new HashSet<>();
      mA = Z.ONE;
      for (final Z p : fsn.toZArray()) {
        done.add(p);
        mA = mA.multiply(p.pow(Math.max(1, (long) fsn.getExponent(p) * fsa.getExponent(p))));
      }
      for (final Z p : fsa.toZArray()) {
        if (done.add(p)) {
          mA = mA.multiply(p.pow(fsa.getExponent(p)));
        }
      }
    }
    return mA;
  }
}
