package irvine.oeis.a010;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A010925 Pisot sequence T(5,21), a(n) = floor( a(n-1)^2/a(n-2) ).
 * @author Sean A. Irvine
 */
public class A010925 extends PisotSequence {

  /** Construct the sequence. */
  public A010925() {
    super(5, 21, Q.ZERO);
  }
}

