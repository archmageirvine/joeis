package irvine.oeis.a203;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (2*x)/((1+x-x^2)*sqrt((x^2+x+1)*(x^2-3*x+1))-x^4+2*x^3+x^2+2*x-1)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A203611 a(n) = Sum_{k=0..n} binomial(k-1,2*k-1-n)*binomial(k,2*k-n), with a(0) = 1.
 * @author Georg Fischer
 */
public class A203611 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A203611() {
    super(0, "[[0],[0,9,3],[-20,-27,-7],[20,10],[-54,-39,-7],[16,20,4],[-70,-29,-3],[30,11,1]]", "[1,1,1,3,7,16,39,95]", 6);
  }
}
