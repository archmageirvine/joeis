package irvine.oeis.a022;

import irvine.math.q.Q;
import irvine.oeis.PisotLSequence;

/**
 * A022034 Define the generalized Pisot sequence <code>T(a(0),a(1))</code> by: <code>a(n+2)</code> is the greatest integer such that <code>a(n+2)/a(n+1) &lt; a(n+1)/a(n)</code>. This is <code>T(6,31)</code>.
 * @author Sean A. Irvine
 */
public class A022034 extends PisotLSequence {

  /** Construct the sequence. */
  public A022034() {
    super(6, 31, Q.NEG_ONE);
  }
}
