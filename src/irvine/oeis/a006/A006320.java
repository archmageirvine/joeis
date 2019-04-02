package irvine.oeis.a006;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;

/**
 * A006320 Royal paths in a lattice.
 * @author Sean A. Irvine
 */
public class A006320 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A006320() {
    super(new SkipSequence(new A006319(), 1), new A006318());
  }
}

