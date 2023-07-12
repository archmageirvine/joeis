package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a000.A000217;

/**
 * A024816 Antisigma(n): Sum of the numbers less than n that do not divide n.
 * @author Sean A. Irvine
 */
public class A024816 extends A000217 {

  private final Sequence mSigma = new A000203();

  /** Construct the sequence. */
  public A024816() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mSigma.next());
  }
}
