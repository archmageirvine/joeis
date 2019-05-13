package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A022024 Define the sequence <code>S(a(0)a(1))</code> by <code>a(n+2)</code> is the least integer such that <code>a(n+2)/a(n+1) &gt; a(n+1)/a(n)</code> for <code>n &gt;= 0</code>. This is <code>S(6,66)</code>.
 * @author Sean A. Irvine
 */
public class A022024 extends PisotSequence {

  /** Construct the sequence. */
  public A022024() {
    super(6, 66, Q.ONE);
  }
}
