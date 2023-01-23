package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000521;

/**
 * A161395 a(n) = (n+1)*A000521(n)/24.
 * @author Georg Fischer
 */
public class A161395 extends AbstractSequence {

  private int mN = -2;
  private final A000521 mSeq;

  /** Construct the sequence. */
  public A161395() {
    super(-1);
    mSeq = new A000521();
  }

  @Override
  public Z next() {
    ++mN;
    return mSeq.next().multiply(mN + 1).divide(24);
  }
}
