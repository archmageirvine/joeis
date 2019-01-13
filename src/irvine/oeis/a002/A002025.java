package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002025.
 * @author Sean A. Irvine
 */
public class A002025 implements Sequence {

  private Z mN = Z.valueOf(119);
  private final Cheetah mCheetah = new Cheetah();

  private Z aliquot(final Z n) {
    if (n.isProbablePrime()) {
      return Z.ONE;
    }
    final FactorSequence fs = new FactorSequence(n);
    mCheetah.factor(fs);
    if (!fs.isComplete()) {
      throw new UnsupportedOperationException();
    }
    return fs.sigma().subtract(n);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z a = aliquot(mN);
      if (a.compareTo(mN) > 0 && aliquot(a).equals(mN)) {
        return mN;
      }
    }
  }
}
