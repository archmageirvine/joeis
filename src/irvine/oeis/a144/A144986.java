package irvine.oeis.a144;
// Generated by gen_seq4.pl egypfr at 2020-11-19 22:49

import irvine.math.cr.CR;
import irvine.oeis.EgyptianFractionSequence;

/**
 * A144986 Denominators of an Egyptian fraction for 1/Sqrt[7]=0.377964473...
 * @author Georg Fischer
 */
public class A144986 extends EgyptianFractionSequence {

  /** Construct the sequence. */
  public A144986() {
    super(1, CR.SEVEN.inverse().sqrt());
  }
}
