package irvine.oeis.a339;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A339358 Maximum number of copies of a 1234567 permutation pattern in an alternating (or zig-zag) permutation of length n + 11.
 * Recurrence: -(n-1)*((n-3)^2+13*n+4)*a(n) + (2*(n-3)^2+28*n+4)*a(n-1) + (n+9)*((n-3)^2+15*n+12)*a(n-2) = 0
 * @author Georg Fischer
 */
public class A339358 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A339358() {
    super(1, "[[0],[189,102,18,1],[22,16,2],[13,-6,-6,-1]]", "32", 0);
  }
}
