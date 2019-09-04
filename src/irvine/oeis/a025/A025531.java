package irvine.oeis.a025;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025531 <code>a(n) = (2nd</code> elementary symmetric function of <code>{1/1, 1/2</code>, ..., <code>1/n})*(lcm(S))^2</code>, where S <code>= {1,2,...,n}</code>.
 * @author Sean A. Irvine
 */
public class A025531 implements Sequence {

  private long mN = 1;
  private Z mL = Z.ONE;
  private Q mHarmonicSum = Q.ZERO;

  @Override
  public Z next() {
    mL = mL.lcm(Z.valueOf(++mN));
    final Q r = new Q(1, mN);
    for (long p = 1; p < mN; ++p) {
      mHarmonicSum = mHarmonicSum.add(new Q(1, p).multiply(r));
    }
    return mHarmonicSum.multiply(mL.square()).toZ();
  }
}
