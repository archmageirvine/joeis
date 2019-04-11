package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A019492 Pisot sequence T(4,9), <code>a(n) = floor(a(n-1)^2/a(n-2))</code>.
 * @author Sean A. Irvine
 */
public class A019492 extends PisotSequence {

  /** Construct the sequence. */
  public A019492() {
    super(4, 9, Q.ZERO);
  }
}
