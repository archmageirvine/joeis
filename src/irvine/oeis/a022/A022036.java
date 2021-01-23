package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A022036 Define the sequence T(a_0,a_1) by a_{n+2} is the greatest integer such that a_{n+2}/a_{n+1}&lt;a_{n+1}/a_n for n &gt;= 0. This is T(7,43).
 * @author Sean A. Irvine
 */
public class A022036 extends PisotLSequence {

  /** Construct the sequence. */
  public A022036() {
    super(7, 43, Q.NEG_ONE);
  }
}
