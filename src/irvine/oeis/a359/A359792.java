package irvine.oeis.a359;
// manually m1pow at 2023-06-04 11:17

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003415;

/**
 * A359792 a(n) = (-1)^A003415(n), where A003415 is the arithmetic derivative of n.
 * @author Georg Fischer
 */
public class A359792 extends AbstractSequence {

  private final A003415 mSeq = new A003415();

  /** Construct the sequence. */
  public A359792() {
    super(1);
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().testBit(0) ? Z.NEG_ONE : Z.ONE;
  }
}
