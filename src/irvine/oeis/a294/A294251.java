package irvine.oeis.a294;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp((1+x)*(1+x^2)*(1+x^3)-1)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A294251 E.g.f.: exp((1+x)*(1+x^2)*(1+x^3) - 1).
 * @author Georg Fischer
 */
public class A294251 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A294251() {
    super(0, "[[0],[-6],[-5],[-4],[-6],[-2],[-1],[6,1]]", "[1,1,3,19,97,681,5971,50443]", 6);
    setGfType(1);
  }
}
