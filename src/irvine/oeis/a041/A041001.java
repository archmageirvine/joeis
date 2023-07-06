package irvine.oeis.a041;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a038.A038845;

/**
 * A041001 Convolution of A000108(n+1), n &gt;= 0, (Catalan numbers) with A038845 (3-fold convolution of powers of 4).
 * @author Sean A. Irvine
 */
public class A041001 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A041001() {
    super(new A000108().skip(1), new A038845());
  }
}
