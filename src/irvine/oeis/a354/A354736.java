package irvine.oeis.a354;
// Generated by gen_seq4.pl hologf4/hologf at 2022-11-09 23:22

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A354736 a(0) = a(1) = 1; a(n) = 5 * Sum_{k=0..n-2} a(k) * a(n-k-2).
 * @author Georg Fischer
 */
public class A354736 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A354736() {
    // o.g.f. 1/10*(1-(1-20*x^2*(1+x))^(1/2))/x^2
    // recurrence (n+4)*u(n+2)+(-20*n-20)*u(n)+(-20*n+10)*u(n-1) = 0
    super(0, "[[0],[50,-20],[20,-20],[0],[2, 1]]", "[1, 1, 5, 10]", 0);
  }
}
