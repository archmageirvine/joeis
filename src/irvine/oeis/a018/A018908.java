package irvine.oeis.a018;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A018908 Define sequence S(a_0,a_1) by a_{n+2} is least integer such that a_{n+2}/a_{n+1}&gt;a_{n+1}/a_n for n &gt;= 0. This is S(3,4).
 * @author Sean A. Irvine
 */
public class A018908 extends PisotSequence {

  /** Construct the sequence. */
  public A018908() {
    super(3, 4, Q.ONE);
  }
}
