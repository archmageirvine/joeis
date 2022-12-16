package irvine.oeis.a353;
// manually anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000720;
import irvine.oeis.a035.A035250;

/**
 * A353946 a(n) = (pi(2n-1) - pi(n-1))^pi(n) for n &gt; 1, a(1) = 0.
 * @author Georg Fischer
 */
public class A353946 extends AbstractSequence {

  private int mN = 0;
  private A035250 mSeq1 = new A035250();
  private A000720 mSeq2 = new A000720();

  /** Construct the sequence. */
  public A353946() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().pow(mSeq2.next().intValue());
    return (mN == 1) ? Z.ZERO : result;
  }
}
