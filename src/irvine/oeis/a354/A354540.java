package irvine.oeis.a354;
// manually 23022-08-22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A354540 allocated for Arman Shamsgovara.
 * Recurrence: 2*(n+1)*a(n) +(-3*n-5)*a(n-1) +8*(-2*n+3)*a(n-2) +(17*n-23)*a(n-3) +2*(17*n-61)*a(n-4) +(-9*n+41)*a(n-5) +20*(-n+6)*a(n-6) +5*(-n+7)*a(n-7)=0.
 * @author Georg Fischer
 */
public class A354540 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A354540() {
    super(0, "[[0],[35,-5],[120,-20],[41,-9],[-122, 34],[-23, 17],[24,-16],[-5,-3],[2, 2]]", "1, 1, 2, 3, 7, 11, 26", 0);
  }
}
