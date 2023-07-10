package irvine.oeis.a324;

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001285;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A324479 Decimal expansion of real number whose continued fraction expansion is [0, 1, 2, 2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 1, ...] (the Thue-Morse sequence A001285).
 * @author Sean A. Irvine
 */
public class A324479 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A324479() {
    super(0, new PrependSequence(new A001285(), 0));
  }
}
