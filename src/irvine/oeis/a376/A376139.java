package irvine.oeis.a376;
// Generated by gen_seq4.pl 2024-10-10.ack/m1pow at 2024-10-10 21:17

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051903;

/**
 * A376139 a(n) = (-1)^A051903(n).
 * @author Georg Fischer
 */
public class A376139 extends AbstractSequence {

  private final A051903 mSeq = new A051903();

  /** Construct the sequence. */
  public A376139() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq.next().testBit(0) ? Z.NEG_ONE : Z.ONE;
  }
}
