package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A022034 Define the generalized Pisot sequence T(a(0),a(1)) by: a(n+2) is the greatest integer such that a(n+2)/a(n+1) &lt; a(n+1)/a(n). This is T(6,31).
 * @author Sean A. Irvine
 */
public class A022034 extends PisotLSequence {

  /** Construct the sequence. */
  public A022034() {
    super(6, 31, Q.NEG_ONE);
  }
}
