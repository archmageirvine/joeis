package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020751 Pisot sequence T(6,9), a(n) = floor(a(n-1)^2/a(n-2)).
 * @author Sean A. Irvine
 */
public class A020751 extends PisotSequence {

  /** Construct the sequence. */
  public A020751() {
    super(6, 9, Q.ZERO);
  }
}

