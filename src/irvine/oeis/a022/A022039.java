package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A022039 Define the generalized Pisot sequence T(a(0),a(1)) by: a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n). This is T(8,65).
 * @author Sean A. Irvine
 */
public class A022039 extends PisotLSequence {

  /** Construct the sequence. */
  public A022039() {
    super(8, 65, Q.NEG_ONE);
  }
}
