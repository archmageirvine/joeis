package irvine.oeis.a041;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000108;
import irvine.oeis.a038.A038845;

/**
 * A041001.
 * @author Sean A. Irvine
 */
public class A041001 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A041001() {
    super(new SkipSequence(new A000108(), 1), new A038845());
  }
}
