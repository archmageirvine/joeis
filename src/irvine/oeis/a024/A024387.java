package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000384;

/**
 * A024387 <code>[ (4th</code> elementary symmetric function of <code>S(n))/(first</code> elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+3</code> positive integers congruent to <code>1 mod 4}</code>.
 * @author Sean A. Irvine
 */
public class A024387 extends A024380 {

  private final Sequence mA = new A000384();
  {
    mA.next();
    mA.next();
    mA.next();
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
