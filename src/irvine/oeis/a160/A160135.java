package irvine.oeis.a160;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a051.A051377;

/**
 * A160135 Sum of non-exponential divisors of n.
 * @author Georg Fischer
 */
public class A160135 extends AbstractSequence {

  private int mN = 0;
  private A000203 mSeq1 = new A000203();
  private A051377 mSeq2 = new A051377();

  /** Construct the sequence. */
  public A160135() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (++mN == 1) ? Z.ONE : result;
  }
}
