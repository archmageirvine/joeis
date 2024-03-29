package irvine.oeis.a327;
// Generated by gen_seq4.pl build/trionk

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a308.A308680;

/**
 * A327383 Number of colored integer partitions of n such that five colors are used and parts differ by size or by color.
 * @author Georg Fischer
 */
public class A327383 extends AbstractSequence {

  private final A308680 mSeq = new A308680();

  /** Construct the sequence. */
  public A327383() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    ++mN;
    return mSeq.compute(mN, 5);
  }
}

