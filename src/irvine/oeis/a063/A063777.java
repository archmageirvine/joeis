package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063777 t(n^2) is a square and sets a new record for such squares, where t(n) = (sigma(n)-n)*omega(n); or t(n)= A001065(n)*A001221(n).
 * @author Sean A. Irvine
 */
public class A063777 extends Sequence1 {

  private Z mRecord = Z.NEG_ONE;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n2 = mN.square();
      final FactorSequence fs = Jaguar.factor(n2);
      final Z t = fs.sigma().subtract(n2).multiply(fs.omega());
      if (t.compareTo(mRecord) > 0 && t.isSquare()) {
        mRecord = t;
        return mN;
      }
    }
  }
}
