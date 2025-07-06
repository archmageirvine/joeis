package irvine.oeis.a385;

import irvine.oeis.a001.A001462;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A385303 Decimal expansion of the real number whose continued fraction is Golomb's sequence (A001462).
 * @author Sean A. Irvine
 */
public class A385303 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A385303() {
    super(1, new A001462());
  }
}

