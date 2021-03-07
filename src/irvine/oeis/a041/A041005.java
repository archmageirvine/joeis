package irvine.oeis.a041;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a020.A020918;

/**
 * A041005 Convolution of Catalan numbers A000108(n+1), n &gt;= 0, with A020918.
 * @author Sean A. Irvine
 */
public class A041005 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A041005() {
    super(new SkipSequence(new A000108(), 1), new A020918());
  }
}
