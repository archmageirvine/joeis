package irvine.oeis.a051;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: 1/(1-4*x)^(5/2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A051618 a(n) = (4*n+6)(!^4)/6(!^4).
 * @author Georg Fischer
 */
public class A051618 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A051618() {
    super(0, "[[0],[10,4],[-1,-1]]", "[1,10,140]", 1);
    setGfType(1);
  }
}
