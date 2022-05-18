package irvine.oeis.a002;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002046 Larger of amicable pair.
 * @author Sean A. Irvine
 */
public class A002046 implements Sequence {

  private Z mN = Z.valueOf(119);

  private Z aliquot(final Z n) {
    if (n.isProbablePrime()) {
      return Z.ONE;
    }
    final FactorSequence fs = Jaguar.factor(n);
    return fs.sigma().subtract(n);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z a = aliquot(mN);
      if (a.compareTo(mN) > 0 && aliquot(a).equals(mN)) {
        return a;
      }
    }
  }
}
