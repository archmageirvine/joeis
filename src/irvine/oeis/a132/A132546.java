package irvine.oeis.a132;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;

/**
 * A132546 Egyptian fraction representation for the cube root of 72.
 * @author Georg Fischer
 */
public class A132546 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A132546() {
    super(1, CR.valueOf(72).log().divide(CR.THREE).exp(), 1);
  }
}
