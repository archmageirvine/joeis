package irvine.oeis.a143;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A143002 a(0) = 0, a(1) = 1, a(n+1) = 7*(2*n+1)*a(n) + n^4*a(n-1).
 * @author Georg Fischer
 */
public class A143002 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143002() {
    super(0, "[[0],[0, 0, 0, 0,-1],[-7,-14],[1]]", "[0, 1]", 1);
  }
}
