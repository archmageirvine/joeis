package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a008.A008578;

/**
 * A023626.
 * @author Sean A. Irvine
 */
public class A023626 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023626() {
    super(new A008578());
  }
}
