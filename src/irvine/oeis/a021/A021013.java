package irvine.oeis.a021;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A021013 Pisot sequence <code>P(7,11), a(0)=7, a(1)=11, a(n+1)</code> is the nearest integer to <code>a(n)^2/a(n-1)</code>. Agrees with <code>A021014</code> only for <code>n &lt;= 20</code>.
 * @author Sean A. Irvine
 */
public class A021013 extends PisotLSequence {

  /** Construct the sequence. */
  public A021013() {
    super(7, 11, Q.HALF.negate());
  }
}

