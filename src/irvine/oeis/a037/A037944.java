package irvine.oeis.a037;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000594;
import irvine.oeis.a013.A013973;

/**
 * A037944 Coefficients of unique normalized cusp form Delta_18 of weight 18 for full modular group.
 * @author Sean A. Irvine
 */
public class A037944 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A037944() {
    super(new A000594(), new A013973());
  }
}


