package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003285;

/**
 * A053190 Numerators in the convergents of [L_1, L_2, L_3, . . . ] where L_i is period length of the continued fraction for sqrt(i).
 * @author Sean A. Irvine
 */
public class A053190 extends Sequence1 {

  private Z mH0 = Z.ZERO;
  private Z mK0 = Z.ONE;
  private Z mH1 = Z.ONE;
  private Z mK1 = Z.ZERO;
  private final Sequence mCf = new A003285();

  @Override
  public Z next() {
    final Z a = mCf.next();
    final Z h = a.multiply(mH1).add(mH0);
    final Z k = a.multiply(mK1).add(mK0);
    mH0 = mH1;
    mK0 = mK1;
    mH1 = h;
    mK1 = k;
    return new Q(mH1, mK1).num();
  }
}
