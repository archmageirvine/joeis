package irvine.oeis.a020;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A020727 Pisot sequence <code>P(2,7)</code>: <code>a(0)=2, a(1)=7</code>, thereafter <code>a(n+1)</code> is the nearest integer to <code>a(n)^2/a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A020727 extends PisotSequence {

  /** Construct the sequence. */
  public A020727() {
    super(2, 7, Q.ZERO);
  }
}

