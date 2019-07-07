package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024389 <code>[ (4th</code> elementary symmetric function of S(n))/(2nd elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+3</code> positive integers congruent to <code>1 mod 4}</code>.
 * @author Sean A. Irvine
 */
public class A024389 implements Sequence {

  private final Sequence mB = new A024380();
  private final Sequence mA = new A024378();
  {
    mA.next();
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
