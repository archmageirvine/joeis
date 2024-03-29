package irvine.oeis.a158;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(12*x-x^2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A158516 a(n) = Hermite(n,6).
 * @author Georg Fischer
 */
public class A158516 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A158516() {
    super(0, "[[0],[2],[-12],[2,1]]", "[1,12,142,1656]", 2);
    setGfType(1);
  }
}
