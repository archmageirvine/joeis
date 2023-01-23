package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000521;

/**
 * A161557 a(n) = (n+1)*A000521(n), n&gt;(-1).
 * @author Georg Fischer
 */
public class A161557 extends AbstractSequence {

  private int mN = -2;
  private final A000521 mSeq;

  /** Construct the sequence. */
  public A161557() {
    super(-1);
    mSeq = new A000521();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq.next();
    return (mN == -1) ? Z.ONE : result.multiply(mN + 1);
  }
}
