package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a014.A014284;

/**
 * A024532 <code>a(n) = [ (3rd</code> elementary symmetric function of <code>P(n))/(first</code> elementary symmetric function of <code>P(n)) ]</code>, where <code>P(n) = {1, p(1), p(2)</code>, ..., <code>p(n-1)}</code>, where <code>p(0) = 1</code>.
 * @author Sean A. Irvine
 */
public class A024532 extends A024523 {

  private final Sequence mA = new SkipSequence(new A014284(), 2);

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
