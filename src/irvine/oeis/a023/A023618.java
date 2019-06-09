package irvine.oeis.a023;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000204;
import irvine.oeis.a002.A002808;

/**
 * A023618 Convolution of Lucas numbers and composite numbers.
 * @author Sean A. Irvine
 */
public class A023618 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A023618() {
    super(new A000204(), new A002808());
  }
}
