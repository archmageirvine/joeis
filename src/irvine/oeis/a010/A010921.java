package irvine.oeis.a010;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A010921 Shallit sequence <code>S(3,13), a(n)=[ a(n-1)^2/a(n-2)+1 ]</code>.
 * @author Sean A. Irvine
 */
public class A010921 extends PisotSequence {

  /** Construct the sequence. */
  public A010921() {
    super(3, 13, Q.ONE);
  }
}

