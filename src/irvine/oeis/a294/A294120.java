package irvine.oeis.a294;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(3*((1+x)^3-1))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A294120 E.g.f.: exp(3*((1+x)^3 - 1)).
 * @author Georg Fischer
 */
public class A294120 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A294120() {
    super(0, "[[0],[-9],[-18],[-9],[3,1]]", "[1,9,99,1233,16929]", 3);
    setGfType(1);
  }
}
