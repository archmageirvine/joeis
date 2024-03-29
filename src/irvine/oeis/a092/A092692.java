package irvine.oeis.a092;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: -log(1-x)/(1-x^2)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A092692 Expansion of e.g.f. -log(1-x)/(1-x^2).
 * @author Georg Fischer
 */
public class A092692 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A092692() {
    super(0, "[[0],[2,1],[-3,-1],[-2,-1],[3,1]]", "[0,1,1,8,18]", 3);
    setGfType(1);
  }
}
