package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A019477 Define the sequence <code>S(a(0),a(1)) by a(n+2)</code> is the least integer such that <code>a(n+2)/a(n+1) &gt; a(n+1)/a(n)</code> for <code>n &gt;= 0</code>. This is <code>S(3,15)</code> (agrees with A019478 only for <code>n &lt;= 23)</code>.
 * @author Sean A. Irvine
 */
public class A019477 extends PisotSequence {

  /** Construct the sequence. */
  public A019477() {
    super(3, 15, Q.ONE);
  }
}
