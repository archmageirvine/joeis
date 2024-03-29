package irvine.oeis.a262;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (-2*x^3-3*x^2-2*x+1)/(2*x^2*sqrt(1-4*x))-1/(2*x^2)+1/2
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A262768 a(n) = binomial(2*n+2,n)-2*binomial(2*n,n)+binomial(2*n-2,n).
 * @author Georg Fischer
 */
public class A262768 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A262768() {
    super(0, "[[0],[0,-2,4],[-11,-20,-9],[-200,-170,-30],[40,48,8]]", "[0,0,4,20,85]", 3);
  }
}
