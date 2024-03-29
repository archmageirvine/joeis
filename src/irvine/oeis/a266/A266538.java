package irvine.oeis.a266;
// Generated by gen_seq4.pl simple3 at 2023-03-24 12:16

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a256.A256249;

/**
 * A266538 Twice the partial sums of A006257 (Josephus problem).
 * @author Georg Fischer
 */
public class A266538 extends AbstractSequence {

  private int mN = -1;
  private final A256249 mSeq = new A256249();

  /** Construct the sequence. */
  public A266538() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mSeq.next());
  }
}
