package irvine.oeis.a336;
// Generated by gen_seq4.pl holos at 2021-06-02 19:27
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A336634 Sum_{n&gt;=0} a(n) * x^n / (n!)^2 = exp(-x) * BesselI(0,2*sqrt(x))^2.
 * Recurrence: n*a(n)=-(3*n^2-7*n+3)*a(n-1)+(7-3*n)*(n-1)^2*a(n-2)-(n-1)^2*(n-2)^2*a(n-3)
 * @author Georg Fischer
 */
public class A336634 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A336634() {
    super(0, "[[0],[-4, 12,-13, 6,-1],[7,-17, 13,-3],[-3, 7,-3],[0,-1]]", "1, 1, 0,-4, 14,-18,-168, 1920,-11898", 0);
  }
}
