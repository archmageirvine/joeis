package irvine.oeis.a273;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A273720 Number of horizontal steps in the peaks of all bargraphs having semiperimeter n (n&gt;=2).
 * Recurrence: a(n)=((2*(3*n-7))*(2*n-9)*a(n-1)-(254-155*n+22*n^2)*a(n-2)+(2*(101-58*n+8*n^2))*a(n-3)-(86-47*n+6*n^2)*a(n-4)+(2*(n-6))*(2*n-5)*a(n-5)-(n-6)*(2*n-5)*a(n-6))/((n-2)*(2*n-9))
 * @author Georg Fischer
 */
public class A273720 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A273720() {
    super(2, "[[0],[-30, 17,-2],[60,-34, 4],[-86, 47,-6],[202,-116, 16],[-254, 155,-22],[126,-82, 12],[-18, 13,-2]]", "1, 3, 8, 21, 57, 162, 479, 1458, 4528, 14259, 45349, 145289", 0);
  }
}
