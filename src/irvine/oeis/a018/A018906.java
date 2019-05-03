package irvine.oeis.a018;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A018906 Define the Shallit sequence <code>S(a_0,a_1)</code> by <code>a_{n+2}</code> is the least integer <code>&gt; a_{n+1}^2/a_n</code> for <code>n &gt;= 0</code>. This is <code>S(2,6)</code>.
 * @author Sean A. Irvine
 */
public class A018906 extends PisotSequence {

  /** Construct the sequence. */
  public A018906() {
    super(2, 6, Q.ONE);
  }
}
