package irvine.oeis.a343;
// manually andiv 

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a037.A037153;

/**
 * A343593 a(n) is the smallest number k &gt; 0 such that n! + n + k is prime.
 * @author Georg Fischer
 */
public class A343593 extends AbstractSequence {

  private final A037153 mSeq1 = new A037153();
  private long mN;

  /** Construct the sequence. */
  public A343593() {
    super(0);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : mSeq1.next().subtract(mN);
  }
}
