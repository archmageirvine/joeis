package irvine.oeis.a212;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A212365 Number of Dyck n-paths all of whose ascents and descents have lengths equal to 1 (mod 6).
 * Recurrence: (n+6)*a(n)+(-2*n-9)*a(n-1)+(n+3)*a(n-2)+(-2*n+6)*a(n-6)+(-2*n+9)*a(n-7)+a(n-12)*(n-12) = 0.
 * @author Georg Fischer
 */
public class A212365 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A212365() {
    super(0, "[[0],[-12, 1],[0],[0],[0],[0],[9,-2],[6,-2],[0],[0],[0],[3, 1],[-9,-2],[6, 1]]", "1, 1, 1, 1, 1, 1, 1", 0);
  }
}
