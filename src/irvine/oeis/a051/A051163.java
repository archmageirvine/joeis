package irvine.oeis.a051;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a027.A027826;

/**
 * A051163 Sequence is defined by property that (a0,a1,a2,a3,...) = binomial transform of (a0,a0,a1,a1,a2,a2,a3,a3,...).
 * @author Sean A. Irvine
 */
public class A051163 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A051163() {
    super(new A027826());
  }
}
