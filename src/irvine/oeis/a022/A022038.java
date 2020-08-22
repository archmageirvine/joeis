package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A022038 Define the sequence T(a_0,a_1) by a_{n+2} is the greatest integer such that a_{n+2}/a_{n+1}&lt;a_{n+1}/a_n for n &gt;= 0. This is T(8,57).
 * @author Sean A. Irvine
 */
public class A022038 extends PisotLSequence {

  /** Construct the sequence. */
  public A022038() {
    super(8, 57, Q.NEG_ONE);
  }
}
