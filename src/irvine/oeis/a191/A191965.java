package irvine.oeis.a191;
// Generated by gen_seq4.pl simple3 at 2023-03-24 12:16

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006855;

/**
 * A191965 A problem of Zarankiewicz: maximal number of 1's in a symmetric n X n matrix of 0's and 1's with 0's on the main diagonal and no "rectangle" with 1's at the four corners.
 * @author Georg Fischer
 */
public class A191965 extends AbstractSequence {

  private int mN = 0;
  private final A006855 mSeq = new A006855();

  /** Construct the sequence. */
  public A191965() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mSeq.next());
  }
}
