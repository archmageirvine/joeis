package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A022040 Define the sequence T(a(0),a(1)) by a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n) for n &gt;= 0. This is T(16,36).
 * @author Sean A. Irvine
 */
public class A022040 extends PisotLSequence {

  /** Construct the sequence. */
  public A022040() {
    super(16, 36, Q.NEG_ONE);
  }
}
