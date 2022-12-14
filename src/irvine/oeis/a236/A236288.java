package irvine.oeis.a236;
// manually anopan 1, 1

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a049.A049820;

/**
 * A236288
 * @author Georg Fischer
 */
public class A236288 extends AbstractSequence {

  private A000203 mSeq1 = new A000203();
  private A049820 mSeq2 = new A049820();

  /** Construct the sequence. */
  public A236288() {
    super(1);
  }

  @Override
  public Z next() {
    return mSeq1.next().pow(mSeq2.next().intValue());
  }
}
