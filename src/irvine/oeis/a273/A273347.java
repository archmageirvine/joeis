package irvine.oeis.a273;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A273347 The sum of the areas of the bargraphs of semiperimeter n (n&gt;=2).
 * Recurrence: a(n)=((69-115*n+28*n^2)*a(n-1)-(264-265*n+52*n^2)*a(n-2)+(3*(29-29*n+4*n^2))*a(n-3)-(3*(10-21*n+4*n^2))*a(n-4)+(4*n-9)*(5*n-29)*a(n-5)+(4*n-13)*(n-6)*a(n-6)+(n-7)*(4*n-9)*a(n-7))/(n*(4*n-13))
 * @author Georg Fischer
 */
public class A273347 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A273347() {
    super(2, "[[0],[63,-37, 4],[78,-37, 4],[261,-161, 20],[-30, 63,-12],[87,-87, 12],[-264, 265,-52],[69,-115, 28],[0, 13,-4]]", "1, 4, 16, 60, 218, 778, 2744, 9600, 33391, 115638, 399137, 1374050, 4720272", 0);
  }
}
