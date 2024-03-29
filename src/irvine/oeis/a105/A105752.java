package irvine.oeis.a105;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: cosh(log(1+x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A105752 Expansion of e.g.f. cos(i*log(1 + x)), i = sqrt(-1).
 * @author Georg Fischer
 */
public class A105752 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A105752() {
    super(0, "[[0],[-1,1],[1,3],[8,4],[6,2]]", "[1,0,1,-3,12]", 3);
    setGfType(1);
  }
}
