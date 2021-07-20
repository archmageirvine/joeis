package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002161 Decimal expansion of square root of Pi.
 * @author Sean A. Irvine
 */
public class A002161 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002161() {
    super(CR.SQRT_PI);
  }
}
