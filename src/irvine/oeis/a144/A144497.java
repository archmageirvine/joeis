package irvine.oeis.a144;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (exp(x)*(37-30*x+9*x^2-x^3))/(1-x)^7
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A144497 Row 4 of array in A144502.
 * @author Georg Fischer
 */
public class A144497 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A144497() {
    super(0, "[[0],[-1],[15,1],[-101,-10],[346,39],[-534,-67],[185,37]]", "[37,266,2165,19714,198773,2199722,26516581]", 5);
    setGfType(1);
  }
}
