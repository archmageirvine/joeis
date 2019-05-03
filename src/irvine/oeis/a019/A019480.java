package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A019480 Define the sequence <code>S(a(0),a(1))</code> by <code>a(n+2)</code> is the least integer such that <code>a(n+2)/a(n+1) &gt; a(n+1)/a(n)</code> for <code>n &gt;= 0</code>. This is <code>S(4,12)</code> (agrees with <code>A019481</code> for <code>n &lt;= 19</code> only).
 * @author Sean A. Irvine
 */
public class A019480 extends PisotSequence {

  /** Construct the sequence. */
  public A019480() {
    super(4, 12, Q.ONE);
  }
}
