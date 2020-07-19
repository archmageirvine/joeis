package irvine.oeis.a033;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000027;
import irvine.oeis.a000.A000032;

/**
 * A033811 Convolution of natural numbers <code>n &gt;= 1</code> with Lucas numbers <code>L(k)(A000032)</code> for k <code>&gt;= 2</code>.
 * @author Sean A. Irvine
 */
public class A033811 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A033811() {
    super(new A000027(), new SkipSequence(new A000032(), 2));
  }
}
