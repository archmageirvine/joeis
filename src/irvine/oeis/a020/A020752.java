package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020752 Pisot sequence T(7,10), a(n) = floor(a(n-1)^2/a(n-2)).
 * @author Sean A. Irvine
 */
public class A020752 extends PisotSequence {

  /** Construct the sequence. */
  public A020752() {
    super(7, 10, Q.ZERO);
  }
}

