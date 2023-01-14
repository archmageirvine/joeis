package irvine.oeis.a359;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A359742 Viggo Brun's ternary continued fraction algorithm applied to { log 2, log 3/2, log 5/4 } produces a list of triples (p,q,r); sequence gives p values.
 * @author Sean A. Irvine
 */
public class A359742 extends Sequence0 {

  private CR mC = CR.valueOf(new Q(5, 4)).log();
  private CR mB = CR.valueOf(new Q(3, 2)).log();
  private CR mA = CR.TWO.log();
  private Z[] mA3 = {Z.ONE, Z.ZERO, Z.ZERO};
  private Z[] mB3 = {Z.ZERO, Z.ONE, Z.ZERO};
  private Z[] mC3 = {Z.ZERO, Z.ZERO, Z.ONE};

  /** Construct the sequence. */
  public A359742() {
    next();
    next();
  }

  protected Z select(final Z b0, final Z b1, final Z b2) {
    return b0;
  }

  @Override
  public Z next() {
    mA = mA.subtract(mB);
    mB3[0] = mA3[0].add(mB3[0]);
    mB3[1] = mA3[1].add(mB3[1]);
    mB3[2] = mA3[2].add(mB3[2]);
    final Z res = select(mB3[0], mB3[1], mB3[2]);
    if (mA.compareTo(mB) < 0) {
      final CR tmp = mA;
      mA = mB;
      mB = tmp;
      final Z[] tmp3 = mA3;
      mA3 = mB3;
      mB3 = tmp3;
    }
    if (mB.compareTo(mC) < 0) {
      final CR tmp = mB;
      mB = mC;
      mC = tmp;
      final Z[] tmp3 = mB3;
      mB3 = mC3;
      mC3 = tmp3;
    }
    return res;
  }
}
