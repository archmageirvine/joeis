package irvine.oeis.a143;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A143001 a(0) = 0, a(1) = 1, a(n+1) = 5*(2*n+1)*a(n) + n^4*a(n-1).
 * @author Georg Fischer
 */
public class A143001 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143001() {
    super(0, "[[0],[0, 0, 0, 0,-1],[-5,-10],[1]]", "[0, 1]", 1);
  }
}
