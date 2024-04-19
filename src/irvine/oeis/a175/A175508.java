package irvine.oeis.a175;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a003.A003963;

/**
 * A175508 a(n) is the difference of n and the product of the indices of prime factors of n with multiplicity, a(1) = 0.
 * @author Georg Fischer
 */
public class A175508 extends AbstractSequence {

  private int mN = 0;
  private final A003963 mSeq2 = new A003963();

  /** Construct the sequence. */
  public A175508() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Z.valueOf(mN).subtract(mSeq2.next());
    return (mN == 1) ? Z.ONE : result;
  }
}
