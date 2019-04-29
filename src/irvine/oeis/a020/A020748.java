package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020748 Pisot sequence <code>T(4,10), a(n) = floor(a(n-1)^2/a(n-2))</code>.
 * @author Sean A. Irvine
 */
public class A020748 extends PisotSequence {

  /** Construct the sequence. */
  public A020748() {
    super(4, 10, Q.ZERO);
  }
}

