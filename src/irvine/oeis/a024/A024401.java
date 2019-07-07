package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024401 <code>a(n) = [ (3rd</code> elementary symmetric function of S(n))/(2nd elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+2</code> positive integers congruent to <code>2 mod 3}</code>.
 * @author Sean A. Irvine
 */
public class A024401 implements Sequence {

  private final Sequence mB = new A024392();
  private final Sequence mA = new A024391();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
