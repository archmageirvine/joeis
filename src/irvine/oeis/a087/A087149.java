package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;

/**
 * A087149 Least positive multiples of index n that can result from the self-convolution of a monotonically increasing sequence (A087148).
 * @author Sean A. Irvine
 */
public class A087149 extends ConvolutionSequence {

  private long mN = 0;

  /** Construct the sequence. */
  public A087149() {
    super(1, new A087148());
  }

  @Override
  public Z next() {
    return super.next().divide(++mN);
  }
}
