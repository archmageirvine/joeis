package irvine.oeis.a271;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A271218 Number of symmetric linked diagrams with n links and no simple link.
 * Recurrence: a(n)=2*a(n-1)+(2*n-3)*a(n-2)-(2*n-5)*a(n-3)+2*a(n-4)-a(n-5)
 * @author Georg Fischer
 */
public class A271218 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A271218() {
    super(0, "[[0],[-1],[2],[5,-2],[-3, 2],[2],[-1]]", "1, 0, 1, 3, 12, 39, 167, 660, 3083, 13961, 70728", 0);
  }
}
