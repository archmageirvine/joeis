package irvine.oeis.a004;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000204;

/**
 * A004799 Self convolution of Lucas numbers <code>1,3,4,7,..</code>.
 * @author Sean A. Irvine
 */
public class A004799 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A004799() {
    super(new A000204());
  }
}
