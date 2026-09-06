package irvine.oeis.a086;

import irvine.oeis.Combiner;
import irvine.oeis.a003.A003473;

/**
 * A086479 Number of invertible circulant (0,1) matrices over the reals that have even determinant.
 * @author Sean A. Irvine
 */
public class A086479 extends Combiner {

  /** Construct the sequence. */
  public A086479() {
    super(1, new A086323(), new A003473(), SUBTRACT);
  }
}

