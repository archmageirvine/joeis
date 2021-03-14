package irvine.oeis.a045;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a020.A020922;

/**
 * A045530 Convolution of A000108 (Catalan numbers) with A020922.
 * @author Sean A. Irvine
 */
public class A045530 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A045530() {
    super(new A000108(), new A020922());
  }
}
