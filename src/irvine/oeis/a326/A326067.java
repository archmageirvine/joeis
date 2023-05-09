package irvine.oeis.a326;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a033.A033879;

/**
 * A326067 a(n) = sigma(n) - sigma(A032742(n)) - n, where A032742 gives the largest proper divisor of n, and sigma is the sum of divisors of n.
 * @author Georg Fischer
 */
public class A326067 extends AbstractSequence {

  private A326068 mSeq1 = new A326068();
  private A033879 mSeq2 = new A033879();

  /** Construct the sequence. */
  public A326067() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().subtract(mSeq2.next());
  }
}
