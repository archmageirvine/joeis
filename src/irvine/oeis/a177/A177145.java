package irvine.oeis.a177;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: arcsin(x)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A177145 Expansion of e.g.f. arcsin(x).
 * @author Georg Fischer
 */
public class A177145 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A177145() {
    super(1, "[[0],[0,0,1],[0],[-2,-3,-1]]", "[1,0,1,0]", 2);
    setGfType(1);
  }
}
