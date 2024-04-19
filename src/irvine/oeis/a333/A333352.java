package irvine.oeis.a333;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a055.A055396;
import irvine.oeis.a061.A061395;

/**
 * A333352 a(n) is the product of indices of the smallest and greatest prime factors of n.
 * @author Georg Fischer
 */
public class A333352 extends AbstractSequence {

  private int mN = 0;
  private final A055396 mSeq1 = new A055396();
  private final A061395 mSeq2 = new A061395();

  /** Construct the sequence. */
  public A333352() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().multiply(mSeq2.next());
    return (++mN == 1) ? Z.ONE : result;
  }
}
