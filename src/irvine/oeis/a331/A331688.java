package irvine.oeis.a331;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(-x/(1-x))/(1-2*x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A331688 E.g.f.: exp(-x/(1 - x)) / (1 - 2*x).
 * @author Georg Fischer
 */
public class A331688 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A331688() {
    super(0, "[[0],[2,2],[-7,-5],[9,4],[-3,-1]]", "[1,1,3,17,137]", 3);
    setGfType(1);
  }
}
