package irvine.oeis.a160;
// manually anopan 1,1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000005;
import irvine.oeis.a049.A049419;

/**
 * A160097 Number of non-exponential divisors of n.
 * @author Georg Fischer
 */
public class A160097 extends AbstractSequence {

  private int mN = 0;
  private A000005 mSeq1 = new A000005();
  private A049419 mSeq2 = new A049419();

  /** Construct the sequence. */
  public A160097() {
    super(1);
  }

  @Override
  public Z next() {
    final Z result = mSeq1.next().subtract(mSeq2.next());
    return (++mN == 1) ? Z.ONE : result;
  }
}
