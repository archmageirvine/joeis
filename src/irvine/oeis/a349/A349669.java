package irvine.oeis.a349;
// Generated by gen_seq4.pl seqop at 2023-06-02 22:45

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005384;

/**
 * A349669 a(n) is the n-th Sophie Germain prime reduced mod n.
 * @author Georg Fischer
 */
public class A349669 extends AbstractSequence {

  private int mN = 0;
  private final A005384 mSeq = new A005384();

  /** Construct the sequence. */
  public A349669() {
    super(1);
    int bOffset = 0;
    while (bOffset < mN) {
      ++bOffset;
      mSeq.next();
    }
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().mod(Z.valueOf(mN));
  }
}
