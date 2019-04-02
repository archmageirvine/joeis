package irvine.oeis.a019;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A019482 Define the sequence S(a(0),a(1)) by a(n+2) is the least integer such that a(n+2)/a(n+1) &gt; a(n+1)/a(n) for n &gt;= 0. This is S(4,28).
 * @author Sean A. Irvine
 */
public class A019482 extends PisotSequence {

  /** Construct the sequence. */
  public A019482() {
    super(4, 28, Q.ONE);
  }
}
