package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A019477 Define the sequence S(a(0),a(1)) by a(n+2) is the least integer such that a(n+2)/a(n+1) &gt; a(n+1)/a(n) for n &gt;= 0. This is S(3,15) (agrees with A019478 only for n &lt;= 23).
 * @author Sean A. Irvine
 */
public class A019477 extends PisotSequence {

  /** Construct the sequence. */
  public A019477() {
    super(3, 15, Q.ONE);
  }
}
