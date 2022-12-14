package irvine.oeis.a240;
// manually anopsn 1, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a050.A050376;

/**
 * A240536 S_9 sequence in partition of integers &gt; 1 described in A240521.
 * @author Georg Fischer
 */
public class A240536 extends AbstractSequence {

  private A050376 mSeq1 = new A050376();
  private Z mP0 = mSeq1.next();
  private Z mP1 = mSeq1.next();
  private Z mP2 = mSeq1.next();

  /** Construct the sequence. */
  public A240536() {
    super(1);
  }

  @Override
  public Z next() {
    // a(n) = A050376(n) * A050376(n+3).
    final Z p3 = mSeq1.next();
    final Z result = mP0.multiply(p3);
    mP0 = mP1;
    mP1 = mP2;
    mP2 = p3;
    return result;
  }
}
