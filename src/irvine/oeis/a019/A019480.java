package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A019480 Define the sequence S(a(0),a(1)) by <code>a(n+2)</code> is the least integer such that <code>a(n+2)/a(n+1) &gt; a(n+1)/a(n)</code> for <code>n &gt;= 0.</code> This is S(4,12) (agrees with A019481 for <code>n &lt;= 19</code> only).
 * @author Sean A. Irvine
 */
public class A019480 extends PisotSequence {

  /** Construct the sequence. */
  public A019480() {
    super(4, 12, Q.ONE);
  }
}
