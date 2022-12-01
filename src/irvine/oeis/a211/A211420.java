package irvine.oeis.a211;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A211420 Integral factorial ratio sequence: a(n) = (8*n)!*n!/((4*n)!*(3*n)!*(2*n)!).
 * Recurrence: 3*(3*n-1)*(2*n-1)*(3*n-2)*n*a(n) - 8*(8*n-3)*(8*n-1)*(8*n-7)*(8*n-5)*a(n-1) = 0
 * @author Georg Fischer
 */
public class A211420 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A211420() {
    super(0, "[[0],[840,-11264, 44032,-65536, 32768],[0, 6,-39, 81,-54]]", "1", 0);
  }
}
