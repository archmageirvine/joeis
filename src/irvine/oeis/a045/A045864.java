package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045864 Number of root quadruples with entry -n for integer Apollonian circle packings.
 * @author Sean A. Irvine
 */
public class A045864 implements Sequence {

  // After Michel Marcus

  private long mN = 0;

  private long chim4(final long p) {
    return (p & 1) == 0 ? 0 : (p & 2) == 0 ? 1 : -1;
  }

  private int delta(final long n) {
    return (n & 3) == 2 ? 1 : 0;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final FactorSequence fs = Cheetah.factor(mN);
    Q prod = new Q(mN, 4);
    for (final Z p : fs.toZArray()) {
      prod = prod.multiply(p.subtract(chim4(p.longValue()))).divide(p);
    }
    return prod.add(new Q(Z.ONE.shiftLeft(fs.omega() - delta(mN)), Z.TWO)).toZ();
  }
}
