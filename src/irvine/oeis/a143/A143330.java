package irvine.oeis.a143;
// Generated by gen_seq4.pl holos at 2020-04-12 21:28
// ogf: (1-x^2-sqrt(1-4*x-2*x^2+x^4))/(2*x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A143330 G.f. satisfies: A(x) = (1 + x*A(x)^2)/(1 - x^2).
 * @author Georg Fischer
 */
public class A143330 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A143330() {
    super(0, "[[0],[-6,3,3],[0],[-18,-17,-5],[-84,-66,-12],[-18,1,1],[-132,-46,-4],[42,13,1]]", "[1,1,3,8,25,83,289,1041]", 6);
  }
}
