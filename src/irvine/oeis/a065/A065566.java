package irvine.oeis.a065;

import irvine.math.q.Q;

/**
 * A065566 Numbers k such that floor((5/4)^(k+1))/floor((5/4)^k) = 5/4.
 * @author Sean A. Irvine
 */
public class A065566 extends A065564 {

  /** Construct the sequence. */
  public A065566() {
    super(new Q(5, 4));
  }
}
