package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020728 Pisot sequence T(2,9), a(n) = floor(a(n-1)^2/a(n-2)).
 * @author Sean A. Irvine
 */
public class A020728 extends PisotSequence {

  /** Construct the sequence. */
  public A020728() {
    super(2, 9, Q.ZERO);
  }
}

