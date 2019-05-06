package irvine.oeis.a021;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A021008 Pisot sequence <code>P(5,11), a(0)=5, a(1)=11, a(n+1)</code> is the nearest integer to <code>a(n)^2/a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A021008 extends PisotLSequence {

  /** Construct the sequence. */
  public A021008() {
    super(5, 11, Q.HALF.negate());
  }
}

