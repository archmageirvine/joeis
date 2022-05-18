package irvine.oeis.a015;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * A015710 Least k &gt;= 0 such that phi(n) * sigma(n) + k^2 is a perfect square, or -1 if impossible.
 * @author Sean A. Irvine
 */
public class A015710 extends A015713 {

  // Note A015713 is conjectural, as a consequence so is this

  private Z mN = Z.ZERO;
  private Z mNextZero = super.next();

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mNextZero.equals(mN)) {
      mNextZero = super.next();
      return Z.NEG_ONE;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final Z a = fs.sigma().multiply(fs.phi());
    long k = -1;
    while (true) {
      final Z zk = Z.valueOf(++k);
      final Z t = a.add(zk.square());
      if (t.sqrtAndRemainder()[1].isZero()) {
        return zk;
      }
    }
  }
}
