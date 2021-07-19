package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A014176 Decimal expansion of the silver mean, 1+sqrt(2).
 * @author Sean A. Irvine
 */
public class A014176 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A014176() {
    super(CR.ONE.add(CR.SQRT2));
  }
}
