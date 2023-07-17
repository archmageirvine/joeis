package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.a006.A006521;

/**
 * A016060 (s(n)+s(n+1))/18, where s()=A006521.
 * @author Sean A. Irvine
 */
public class A016060 extends A006521 {

  /** Construct the sequence. */
  public A016060() {
    super(3);
  }

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
