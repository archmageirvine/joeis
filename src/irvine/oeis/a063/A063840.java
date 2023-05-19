package irvine.oeis.a063;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063840 Numbers k such that sigma(k) - usigma(k) is a square and sets a new record for such squares.
 * @author Sean A. Irvine
 */
public class A063840 extends Sequence1 {

  private Z mRecord = Z.NEG_ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final Z s = fs.sigma().subtract(fs.unitarySigma());
      if (s.compareTo(mRecord) > 0 && s.isSquare()) {
        mRecord = s;
        return Z.valueOf(mN);
      }
    }
  }
}
