package irvine.oeis.a346;
// Generated by gen_seq4.pl holos at 2024-02-09 22:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A346076 a(n) = 1 + Sum_{k=1..n-4} a(k) * a(n-k-4).
 * G.f.A(x) satisfies -A+1/(1-x)+x^4*A*(A-1)=0
 * @author Georg Fischer
 */
public class A346076 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A346076() {
    super(0, "[[0], [750, -125, 5], [-1848, 328, -14], [1482, -283, 13], [-384, 80, -4], [834, -151, 7], [-492, 26, 2], [-690, 267, -21], [384, -144, 12], [90, -23, -1], [-252, 122, -6], [150, -149, 19], [0, 48, -12], [6, 3, -3], [-24, 8, 10], [18, -27, -11], [0, 16, 4]]", "1, 1, 1, 1, 1, 2, 3, 4, 5, 7, 11, 17, 25, 36, 54, 84, 131", 0, 0);
  }
}
