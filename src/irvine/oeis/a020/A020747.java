package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020747 Pisot sequence T(4,6), a(n) = floor(a(n-1)^2/a(n-2)).
 * @author Sean A. Irvine
 */
public class A020747 extends PisotSequence {

  /** Construct the sequence. */
  public A020747() {
    super(4, 6, Q.ZERO);
  }
}

