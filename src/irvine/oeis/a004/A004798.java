package irvine.oeis.a004;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000045;

/**
 * A004798 Convolution of Fibonacci numbers 1,2,3,5,... with themselves.
 * @author Sean A. Irvine
 */
public class A004798 extends ConvolutionSequence {

  private static A000045 seq() {
    final A000045 seq = new A000045();
    seq.next();
    seq.next();
    return seq;
  }

  /** Construct the sequence. */
  public A004798() {
    super(1, seq());
  }
}
