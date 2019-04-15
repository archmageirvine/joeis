package irvine.oeis.a010;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A010920 Pisot sequence <code>T(3,13), a(n) = floor( a(n-1)^2/a(n-2) )</code>.
 * @author Sean A. Irvine
 */
public class A010920 extends PisotSequence {

  /** Construct the sequence. */
  public A010920() {
    super(3, 13, Q.ZERO);
  }
}

