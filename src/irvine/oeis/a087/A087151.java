package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.ConvolutionSequence;

/**
 * A087151 Positive square-root of terms of the self-convolution of A087150.
 * @author Sean A. Irvine
 */
public class A087151 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A087151() {
    super(1, new A087150());
  }

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
