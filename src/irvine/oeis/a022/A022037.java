package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A022037 Define the sequence T(a(0), a(1)) by a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n) for n &gt;= 0. This is T(7,50).
 * @author Sean A. Irvine
 */
public class A022037 extends PisotLSequence {

  /** Construct the sequence. */
  public A022037() {
    super(7, 50, Q.NEG_ONE);
  }
}
