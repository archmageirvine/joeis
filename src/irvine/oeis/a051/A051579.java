package irvine.oeis.a051;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 1/(1-2*x)^(7/2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051579 a(n) = (2*n+5)!!/5!!, related to A001147 (odd double factorials).
 * @author Georg Fischer
 */
public class A051579 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051579() {
    super(0, "[[0],[7,2],[-1,-1]]", "[1,7,63]", 1);
    setGfType(1);
  }
}
