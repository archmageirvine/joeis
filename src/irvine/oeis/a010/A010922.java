package irvine.oeis.a010;

import irvine.math.q.Q;
import irvine.oeis.PisotSequence;

/**
 * A010922 Pisot sequence T(14,23), a(n)=[ a(n-1)^2/a(n-2) ].
 * @author Sean A. Irvine
 */
public class A010922 extends PisotSequence {

  /** Construct the sequence. */
  public A010922() {
    super(14, 23, Q.ZERO);
  }
}

