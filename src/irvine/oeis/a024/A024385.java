package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000384;

/**
 * A024385 <code>a(n) = [ (2nd</code> elementary symmetric function of <code>S(n))/(first</code> elementary symmetric function of <code>S(n)) ]</code>, where <code>S(n) =</code> {first <code>n+1</code> positive integers congruent to <code>1 mod 4}</code>.
 * @author Sean A. Irvine
 */
public class A024385 extends A024378 {

  private final Sequence mA = new A000384();
  {
    mA.next();
    mA.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
