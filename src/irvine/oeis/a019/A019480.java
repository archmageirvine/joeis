package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A019480 Define the sequence S(a(0),a(1)) by a(n+2) is the least integer such that a(n+2)/a(n+1) &gt; a(n+1)/a(n) for n &gt;= 0. This is S(4,12) (agrees with A019481 for n &lt;= 19 only).
 * @author Sean A. Irvine
 */
public class A019480 extends PisotSequence {

  /** Construct the sequence. */
  public A019480() {
    super(4, 12, Q.ONE);
  }
}
