package irvine.oeis.a060;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a038.A038533;
import irvine.oeis.a038.A038534;

/**
 * A060629 1/2+Sum_{n &gt;= 1) a(n)*x^(2*n)/(4^n*(2*n)!) = 1/Pi*EllipticK(x).
 * @author Sean A. Irvine
 */
public class A060629 extends Sequence1 {

  private long mN = 0;
  private Z mF = Z.ONE;
  private final Sequence mNum = new A038534();
  private final Sequence mDen = new A038533();
  {
    mNum.next();
    mDen.next();
  }

  @Override
  public Z next() {
    mF = mF.multiply(2 * ++mN).multiply(2 * mN - 1).multiply(4);
    final Q t = new Q(mNum.next(), mDen.next());
    return t.multiply(mF).toZ();
  }
}
