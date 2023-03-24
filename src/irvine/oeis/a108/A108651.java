package irvine.oeis.a108;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a051.A051037;

/**
 * A108651 Multiples of 8 that are divisible by no prime &gt; 5.
 * @author Georg Fischer
 */
public class A108651 extends AbstractSequence {

  private int mN = -1;
  private final A051037 mSeq = new A051037();

  /** Construct the sequence. */
  public A108651() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : Z.EIGHT.multiply(mSeq.next());
  }
}
