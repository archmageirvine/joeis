package irvine.oeis.a280;
// Generated by gen_seq4.pl anopsn 1, 0

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001097;

/**
 * A280968 a(n) = A001097(n) + A001097(n+1).
 * @author Georg Fischer
 */
public class A280968 extends AbstractSequence {

  private final A001097 mSeq1 = new A001097();
  private Z mA;

  /** Construct the sequence. */
  public A280968() {
    super(1);
    mA = mSeq1.next();
  }

  @Override
  public Z next() {
    final Z b = mSeq1.next();
    final Z result = b.add(mA);
    mA = b;
    return result;
  }
}
