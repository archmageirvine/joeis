package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A022023 Define the sequence S(a(0),a(1)) by a(n+2) is the least integer such that a(n+2)/a(n+1) &gt; a(n+1)/a(n) for n &gt;= 0. This is S(6,30).
 * @author Sean A. Irvine
 */
public class A022023 extends PisotSequence {

  /** Construct the sequence. */
  public A022023() {
    super(6, 30, Q.ONE);
  }
}
