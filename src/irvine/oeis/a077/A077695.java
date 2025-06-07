package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.oeis.a000.A000461;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077692.
 * @author Sean A. Irvine
 */
public class A077695 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077695() {
    super(1, new A000461(), Functions.TRIANGULAR::z);
  }
}
