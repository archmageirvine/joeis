package irvine.oeis.a006;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000712;
import irvine.oeis.a197.A197870;

/**
 * A006330.
 * @author Sean A. Irvine
 */
public class A006330 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A006330() {
    super(new A000712(), new A197870());
  }
}

