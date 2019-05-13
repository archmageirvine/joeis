package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A022036 Define the sequence <code>T(a_0,a_1)</code> by <code>a_{n+2}</code> is the greatest integer such that <code>a_{n+2}/a_{n+1}&lt;a_{n+1}/a_n</code> for <code>n &gt;= 0</code>. This is <code>T(7,43)</code>.
 * @author Sean A. Irvine
 */
public class A022036 extends PisotLSequence {

  /** Construct the sequence. */
  public A022036() {
    super(7, 43, Q.NEG_ONE);
  }
}
