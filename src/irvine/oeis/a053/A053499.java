package irvine.oeis.a053;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x+x^3/3+x^9/9)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A053499 Number of degree-n permutations of order dividing 9.
 * @author Georg Fischer
 */
public class A053499 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A053499() {
    super(0, "[[0],[-1],[0],[0],[0],[0],[0],[-1],[0],[-1],[9,1]]", "[1,1,1,3,9,21,81,351,1233,46089,434241]", 9);
    setGfType(1);
  }
}
