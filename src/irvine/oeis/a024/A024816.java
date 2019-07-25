package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a000.A000217;

/**
 * A024816 <code>Antisigma(n)</code>: Sum of the numbers less than n that do not divide <code>n</code>.
 * @author Sean A. Irvine
 */
public class A024816 extends A000217 {

  private final Sequence mSigma = new A000203();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mSigma.next());
  }
}
