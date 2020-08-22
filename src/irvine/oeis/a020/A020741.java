package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020741 Pisot sequence T(6,10), a(n) = floor(a(n-1)^2/a(n-2)).
 * @author Sean A. Irvine
 */
public class A020741 extends PisotSequence {

  /** Construct the sequence. */
  public A020741() {
    super(6, 10, Q.ZERO);
  }
}

