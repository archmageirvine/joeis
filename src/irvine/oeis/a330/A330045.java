package irvine.oeis.a330;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: exp(x)/(1-x^4)
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A330045 Expansion of e.g.f. exp(x) / (1 - x^4).
 * @author Georg Fischer
 */
public class A330045 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A330045() {
    super(0, "[[0],[-1],[5,1],[0],[0],[1],[-5,-1]]", "[1,1,1,1,25,121,361]", 5);
    setGfType(1);
  }
}
