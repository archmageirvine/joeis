package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024388 <code>[ (3rd</code> elementary symmetric function of S(n))/(2nd elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+2</code> positive integers congruent to <code>1 mod 4}</code>.
 * @author Sean A. Irvine
 */
public class A024388 implements Sequence {

  private final Sequence mB = new A024379();
  private final Sequence mA = new A024378();
  {
    mA.next();
    mA.next();
    mB.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
