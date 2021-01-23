package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020749 Pisot sequence T(5,8), a(n) = floor(a(n-1)^2/a(n-2)).
 * @author Sean A. Irvine
 */
public class A020749 extends PisotSequence {

  /** Construct the sequence. */
  public A020749() {
    super(5, 8, Q.ZERO);
  }
}

