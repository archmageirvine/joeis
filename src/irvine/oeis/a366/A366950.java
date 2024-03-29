package irvine.oeis.a366;
// Generated by gen_seq4.pl findre/holose at 2024-02-01 21:32

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A366950 Expansion of e.g.f. exp(x^2+3*x^3).
 * @author Georg Fischer
 */
public class A366950 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A366950() {
    super(0, "[[0], [-9], [-2], [0], [0, 1]]", "1", 0, EGF);
  }
}
