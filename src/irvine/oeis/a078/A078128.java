package irvine.oeis.a078;
// manually anopsn 0, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003108;

/**
 * A078128 Number of ways to write n as sum of cubes&gt;1.
 * @author Georg Fischer
 */
public class A078128 extends AbstractSequence {

  private final A003108 mSeq1 = new A003108();
  private Z mA;

  /** Construct the sequence. */
  public A078128() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.subtract(mA);
    mA = b;
    return result;
  }
}
