package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024403 <code>[ (4th</code> elementary symmetric function of S(n))/(3rd elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+3</code> positive integers congruent to <code>2 mod 3}</code>.
 * @author Sean A. Irvine
 */
public class A024403 implements Sequence {

  private final Sequence mB = new A024393();
  private final Sequence mA = new A024392();
  {
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
