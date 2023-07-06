package irvine.oeis.a006;

import irvine.oeis.ConvolutionSequence;

/**
 * A006320 Royal paths in a lattice.
 * @author Sean A. Irvine
 */
public class A006320 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A006320() {
    super(new A006319().skip(1), new A006318());
  }
}

