package irvine.oeis.a225;
// Generated by gen_seq4.pl simple3 at 2023-03-24 12:16

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a005.A005100;

/**
 * A225241 Numbers n such that the sum of the reciprocals of the even divisors of n is greater than zero and less than one.
 * @author Georg Fischer
 */
public class A225241 extends AbstractSequence {

  private int mN = 0;
  private final A005100 mSeq = new A005100();

  /** Construct the sequence. */
  public A225241() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mSeq.next());
  }
}
