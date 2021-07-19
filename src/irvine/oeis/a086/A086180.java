package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A086180 Decimal expansion of 1 + sqrt(6).
 * @author Sean A. Irvine
 */
public class A086180 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086180() {
    super(CR.ONE.add(CR.SIX.sqrt()));
  }
}
