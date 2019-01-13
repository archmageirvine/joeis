package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a006.A006521;

/**
 * A016060.
 * @author Sean A. Irvine
 */
public class A016060 extends A006521 {

  private Z mPrev = super.next();

  {
    next();
    next();
  }

  @Override
  public Z next() {
    final Z t = mPrev;
    mPrev = super.next();
    return t.add(mPrev).divide(18);
  }
}
