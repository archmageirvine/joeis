package irvine.oeis.a339;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A339516 a(n+1) = (a(n) - 2*(n-1)) * (2*n-1), where a(1)=1.
 * @author Georg Fischer
 */
public class A339516 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A339516() {
    super(1, "[[0],[9,-2],[-20, 6],[12,-6],[0, 2],[-1]]", "1, 1,-3,-35", 0);
  }
}
