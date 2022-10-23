package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a003.A003512;

/**
 * A054086 For k &gt;= 1, let p(k)=least h in N not already an a(i), q(k)=p(k)+k, a(3k-1)=q(k), a(3k)=p(k), a(3k+1)=least h in N not already an a(i).
 * @author Sean A. Irvine
 */
public class A054086 extends Sequence1 {

  private int mT = -1;
  private final Sequence[] mTrisections = {new A054087(), new A003512(), new A054088()};

  @Override
  public Z next() {
    mT = (mT + 1) % 3;
    return mTrisections[mT].next();
  }
}
