package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014284;

/**
 * A024531 <code>a(n) = [ (2nd</code> elementary symmetric function of <code>P(n))/(first</code> elementary symmetric function of <code>P(n)) ]</code>, where <code>P(n) = {1, p(1), p(2)</code>, ..., <code>p(n-1)}</code>, where <code>p(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A024531 extends A024522 {

  private final Sequence mA = new SkipSequence(new A014284(), 1);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
