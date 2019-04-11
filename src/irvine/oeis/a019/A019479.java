package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A019479 Define the sequence S(a_0,a_1) by a_{n+2} is the least integer such that a_{n+2}/a_{n+1}&gt;a_{n+1}/a_n for <code>n &gt;= 0.</code> This is S(4,8).
 * @author Sean A. Irvine
 */
public class A019479 extends PisotSequence {

  /** Construct the sequence. */
  public A019479() {
    super(4, 8, Q.ONE);
  }
}
