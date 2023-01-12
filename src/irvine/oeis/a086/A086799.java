package irvine.oeis.a086;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006519;

/**
 * A086799 Replace all trailing 0's with 1's in binary representation of n.
 * @author Georg Fischer
 */
public class A086799 extends AbstractSequence {

  private A006519 mSeq1 = new A006519();
  private long mN;

  /** Construct the sequence. */
  public A086799() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq1.next().add(mN - 1);
  }
}
