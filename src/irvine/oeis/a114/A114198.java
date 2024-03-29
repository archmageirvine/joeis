package irvine.oeis.a114;
// Generated by gen_seq4.pl holos at 2021-06-13 21:50
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A114198 a(n) = Sum_{k=0..n} binomial(n,k)^2*F(k+1).
 * Recurrence: -a(n)*(n*(n-1)*(13*n^2-52*n+49))+((3*(n-1))*(2*n-5)*(13*n^2-26*n+10)*a(n-1)-(7*n^2-14*n+6)*(13*n^2-52*n+49)*a(n-2)+(n-2)*(182*n^3-819*n^2+1050*n-351)*a(n-3)-(n-2)*(n-3)*(13*n^2-26*n+10)*a(n-4))
 * @author Georg Fischer
 */
public class A114198 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A114198() {
    super(0, "[[0],[-60, 206,-218, 91,-13],[702,-2451, 2688,-1183, 182],[-294, 998,-1149, 546,-91],[150,-600, 801,-429, 78],[0, 49,-101, 65,-13]]", "[1, 2, 7, 31]", 0);
  }
}
