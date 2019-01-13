package irvine.oeis.a014;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000040;

/**
 * A014343.
 * @author Sean A. Irvine
 */
public class A014343 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A014343() {
    super(new A000040(), new A014342());
  }
}

