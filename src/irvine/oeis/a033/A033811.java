package irvine.oeis.a033;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000032;

/**
 * A033811 Convolution of natural numbers n &gt;= 1 with Lucas numbers L(k)(A000032) for k &gt;= 2.
 * @author Sean A. Irvine
 */
public class A033811 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A033811() {
    super(1, new A000027(), new A000032().skip(2));
  }
}
