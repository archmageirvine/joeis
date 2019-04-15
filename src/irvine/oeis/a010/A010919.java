package irvine.oeis.a010;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A010919 Pisot sequence <code>T(4,13), a(n) = floor(a(n-1)^2/a(n-2))</code>.
 * @author Sean A. Irvine
 */
public class A010919 extends PisotSequence {

  /** Construct the sequence. */
  public A010919() {
    super(4, 13, Q.ZERO);
  }
}

