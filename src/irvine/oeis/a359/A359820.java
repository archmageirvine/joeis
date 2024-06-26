package irvine.oeis.a359;
// Generated by gen_seq4.pl parity at 2023-07-10 09:51

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a129.A129283;

/**
 * A359820 a(n) = 1 if n and n' are of different parity, otherwise 0. Here n' stands for the arithmetic derivative of n, A003415(n).
 * @author Georg Fischer
 */
public class A359820 extends AbstractSequence {

  private final A129283 mSeq = new A129283();

  /** Construct the sequence. */
  public A359820() {
    super(0);
  }

  @Override
  public Z next() {
    return mSeq.next().testBit(0) ? Z.ONE : Z.ZERO;
  }
}
