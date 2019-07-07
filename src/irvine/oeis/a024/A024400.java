package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a005.A005449;

/**
 * A024400 <code>[ (4th</code> elementary symmetric function of <code>S(n))/(first</code> elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+3</code> positive integers congruent to <code>2 mod 3}</code>.
 * @author Sean A. Irvine
 */
public class A024400 implements Sequence {

  private final Sequence mB = new A024393();
  private final Sequence mA = new A005449();
  {
    mA.next();
    mA.next();
    mA.next();
    mA.next();
  }

  @Override
  public Z next() {
    return mB.next().divide(mA.next());
  }
}
