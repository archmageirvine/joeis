package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020750 Pisot sequence <code>T(5,9), a(n) = floor(a(n-1)^2/a(n-2))</code>.
 * @author Sean A. Irvine
 */
public class A020750 extends PisotSequence {

  /** Construct the sequence. */
  public A020750() {
    super(5, 9, Q.ZERO);
  }
}

