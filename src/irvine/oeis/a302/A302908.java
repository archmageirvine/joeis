package irvine.oeis.a302;
// Generated by gen_seq4.pl holose at 2020-04-12 21:28
// egf: (6*exp(-x))/(6+x*(3+x)*(6+x))
// DO NOT EDIT here!

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A302908 Expansion of e.g.f. 6*exp(-x)/(6 + x*(3 + x)*(6 + x)).
 * @author Georg Fischer
 */
public class A302908 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A302908() {
    super(0, "[[0],[1],[13,1],[54,9],[78,18],[24,6]]", "[1,-4,22,-164,1589,-19136]", 4);
    setGfType(1);
  }
}
