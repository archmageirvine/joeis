package irvine.oeis.a385;

import irvine.oeis.a001.A001462;
import irvine.oeis.cons.DecimalExpansionFromContinuedFractionSequence;

/**
 * A385303 allocated for Jason Bard.
 * @author Sean A. Irvine
 */
public class A385303 extends DecimalExpansionFromContinuedFractionSequence {

  /** Construct the sequence. */
  public A385303() {
    super(1, new A001462());
  }
}

