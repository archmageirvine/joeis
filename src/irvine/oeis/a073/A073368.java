package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a065.A065855;

/**
 * A073368 Remainder when n is divided by number of composites not exceeding n.
 * @author Sean A. Irvine
 */
public class A073368 extends AbstractSequence {

  private final Sequence mSeq = new A065855().skip(3);
  private long mN = 3;

  /** Construct the sequence. */
  public A073368() {
    super(4);
  }

  @Override
  public Z next() {
    return Z.valueOf(++mN).mod(mSeq.next());
  }
}
