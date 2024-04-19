package irvine.oeis.a108;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a007.A007684;

/**
 * A108227 a(n) is the least number of prime factors for any abundant number with p_n (the n-th prime) as its least factor.
 * @author Georg Fischer
 */
public class A108227 extends AbstractSequence {

  private final A007684 mSeq1 = new A007684();
  private long mN;

  /** Construct the sequence. */
  public A108227() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      mSeq1.next();
      return Z.THREE;
    }
    return mSeq1.next().subtract(mN - 1);
  }
}
