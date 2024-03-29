package irvine.oeis.a065;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (1-2*x-sqrt(1-4*x))/(2*x^2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A065866 a(n) = n! * Catalan(n+1).
 * @author Georg Fischer
 */
public class A065866 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A065866() {
    super(0, "[[0],[6,4],[-3,-1]]", "[1,2,10]", 1);
    setGfType(1);
  }
}
