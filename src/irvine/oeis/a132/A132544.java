package irvine.oeis.a132;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;

/**
 * A132544 Egyptian fraction representation for the cube root of 70.
 * @author Georg Fischer
 */
public class A132544 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A132544() {
    super(1, CR.valueOf(70).log().divide(CR.THREE).exp(), 1);
  }
}
