package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A022025 Define the sequence <code>S(a(0),a(1)) by a(n+2)</code> is the least integer such that <code>a(n+2)/a(n+1) &gt; a(n+1)/a(n)</code> for <code>n &gt;= 0</code>. This is <code>S(6,102)</code>.
 * @author Sean A. Irvine
 */
public class A022025 extends PisotSequence {

  /** Construct the sequence. */
  public A022025() {
    super(6, 102, Q.ONE);
  }
}
