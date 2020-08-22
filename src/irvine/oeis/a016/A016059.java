package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a006.A006521;

/**
 * A016059 (s(n)+s(n+1))/6, where s()=A006521.
 * @author Sean A. Irvine
 */
public class A016059 extends A006521 {

  private Z mPrev = super.next();

  {
    next();
  }

  @Override
  public Z next() {
    final Z t = mPrev;
    mPrev = super.next();
    return t.add(mPrev).divide(6);
  }
}
