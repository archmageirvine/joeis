package irvine.oeis.a010;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A010923 Shallit sequence <code>S(14,23), a(n)=[ a(n-1)^2/a(n-2)+1 ]</code>.
 * @author Sean A. Irvine
 */
public class A010923 extends PisotSequence {

  /** Construct the sequence. */
  public A010923() {
    super(14, 23, Q.ONE);
  }
}

