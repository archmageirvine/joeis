package irvine.oeis.a021;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A021011 Pisot sequence <code>P(6,11), a(0)=6, a(1)=11, a(n+1)</code> is the nearest integer to <code>a(n)^2/a(n-1)</code>.
 * @author Sean A. Irvine
 */
public class A021011 extends PisotLSequence {

  /** Construct the sequence. */
  public A021011() {
    super(6, 11, Q.HALF.negate());
  }
}

