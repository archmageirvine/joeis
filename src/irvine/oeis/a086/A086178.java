package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A086178 Decimal expansion of 1 + 2*sqrt(2).
 * @author Sean A. Irvine
 */
public class A086178 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086178() {
    super(CR.ONE.add(CR.EIGHT.sqrt()));
  }
}
