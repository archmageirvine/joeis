package irvine.oeis.a063;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a005.A005278;

/**
 * A063742 Cototients: numbers k such that x - phi(x) = k has at least one solution.
 * @author Sean A. Irvine
 */
public class A063742 extends ComplementSequence {

  /** Construct the sequence. */
  public A063742() {
    super(new A005278());
  }
}

