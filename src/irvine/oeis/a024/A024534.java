package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * A024534 <code>a(n) = [ (3rd</code> elementary symmetric function of P(n))/(2nd elementary symmetric function of <code>P(n)) ]</code>, where <code>P(n) = {1, p(1), p(2)</code>, ..., <code>p(n-1)}</code>, where <code>p(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A024534 extends A024523 {

  private final Sequence mA = new SkipSequence(new A024522(), 1);
  {
    next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
