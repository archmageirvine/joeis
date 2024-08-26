package irvine.oeis.a071;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a006.A006512;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A071990 extends A006512 {

  private Q mSum = Q.ZERO;

  {
    setOffset(5);
  }

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, super.next()));
    return mSum.num();
  }
}
