package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A022026 Define the sequence <code>T(a(0),a(1))</code> by <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n)</code> for <code>n &gt;= 0</code>. This is <code>T(2,15)</code>.
 * @author Sean A. Irvine
 */
public class A022026 extends PisotLSequence {

  /** Construct the sequence. */
  public A022026() {
    super(2, 15, Q.NEG_ONE);
  }
}
