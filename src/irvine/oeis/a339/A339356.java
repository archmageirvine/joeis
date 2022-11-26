package irvine.oeis.a339;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A339356 Maximum number of copies of a 123456 permutation pattern in an alternating (or zig-zag) permutation of length n + 9.
 * Recurrence: -(n-1)*((n-3)^2+11*n-2)*a(n) + 2*(n+5)*(n+1)*a(n-1) + (n+7)*((n-3)^2+13*n+4)*a(n-2) = 0
 * @author Georg Fischer
 */
public class A339356 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A339356() {
    super(1, "[[0],[91,62,14,1],[10,12,2],[7,-2,-4,-1]]", "16", 0);
  }
}
