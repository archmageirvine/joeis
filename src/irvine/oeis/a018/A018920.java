package irvine.oeis.a018;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A018920 Pisot sequence T(3,10), a(n) = floor(a(n-1)^2/a(n-2)).
 * @author Sean A. Irvine
 */
public class A018920 extends PisotSequence {

  /** Construct the sequence. */
  public A018920() {
    super(3, 10, Q.ZERO);
  }
}
