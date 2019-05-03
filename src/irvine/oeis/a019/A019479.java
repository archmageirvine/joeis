package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A019479 Define the sequence <code>S(a_0,a_1)</code> by <code>a_{n+2}</code> is the least integer such that <code>a_{n+2}/a_{n+1}&gt;a_{n+1}/a_n</code> for <code>n &gt;= 0</code>. This is <code>S(4,8)</code>.
 * @author Sean A. Irvine
 */
public class A019479 extends PisotSequence {

  /** Construct the sequence. */
  public A019479() {
    super(4, 8, Q.ONE);
  }
}
