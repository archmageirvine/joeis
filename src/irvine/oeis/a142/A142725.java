package irvine.oeis.a142;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;

/**
 * A142725 Denominators of an Egyptian fraction for 1/Sqrt[17] = 0.242535625...
 * @author Georg Fischer
 */
public class A142725 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A142725() {
    super(1, CR.valueOf(17).inverse().sqrt());
  }
}
