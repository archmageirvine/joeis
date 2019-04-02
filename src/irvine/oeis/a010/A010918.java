package irvine.oeis.a010;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A010918 Shallit sequence S(8,55): a(n) = [a(n-1)^2/a(n-2)+1].
 * @author Sean A. Irvine
 */
public class A010918 extends PisotSequence {

  /** Construct the sequence. */
  public A010918() {
    super(8, 55, Q.ONE);
  }
}

