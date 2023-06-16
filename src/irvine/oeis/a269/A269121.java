package irvine.oeis.a269;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006480;
import irvine.oeis.a047.A047911;

/**
 * A269121 Number of sequences with n copies each of 1,2,3 avoiding the pattern 123.
 * @author Georg Fischer
 */
public class A269121 extends AbstractSequence {

  private int mN = -1;
  private A006480 mSeq1 = new A006480();
  private A047911 mSeq2 = new A047911();

  /** Construct the sequence. */
  public A269121() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract((++mN == 0) ? Z.ZERO : mSeq2.next());
  }
}
