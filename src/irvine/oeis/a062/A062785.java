package irvine.oeis.a062;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a048.A048050;

/**
 * A062785 a(n) = Chowla's function of n * sigma(n).
 * @author Georg Fischer
 */
public class A062785 extends AbstractSequence {

  private int mN = 0;
  private A000203 mSeq1 = new A000203();
  private A048050 mSeq2 = new A048050();

  /** Construct the sequence. */
  public A062785() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq1.next().multiply(mSeq2.next());
    return (mN == 1) ? Z.NEG_ONE : result;
  }
}
