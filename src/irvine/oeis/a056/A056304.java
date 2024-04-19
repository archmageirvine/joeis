package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000048;
import irvine.oeis.a002.A002075;

/**
 * A056304 Number of primitive (period n) n-bead necklace structures using exactly three different colored beads.
 * A002075(n)-A000048(n)
 * @author Georg Fischer
 */
public class A056304 extends A000048 {

  private final Sequence mSeq = new A002075();

  /** Construct the sequence. */
  public A056304() {
    super(1);
    super.next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(super.next());
  }
}
