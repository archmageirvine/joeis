package irvine.oeis.a051;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 1/(1-2*x)^(9/2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051581 a(n) = (2*n+7)!!/7!!, related to A001147 (odd double factorials).
 * @author Georg Fischer
 */
public class A051581 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051581() {
    super(0, "[[0],[9,2],[-1,-1]]", "[1,9,99]", 1);
    setGfType(1);
  }
}
