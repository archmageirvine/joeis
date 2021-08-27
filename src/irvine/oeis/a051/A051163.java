package irvine.oeis.a051;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a027.A027826;

/**
 * A051152.
 * @author Sean A. Irvine
 */
public class A051163 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A051163() {
    super(new A027826());
  }
}
