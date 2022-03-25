package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000013;
import irvine.oeis.a002.A002076;

/**
 * A056296 Number of n-bead necklace structures using exactly three different colored beads.
 * @author Georg Fischer
 */
public class A056296 extends A000013 {

  private Sequence mSeq = new A002076();

  /** Construct the sequence. */
  public A056296() {
    next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(super.next());
  }
}
