package irvine.oeis.a051;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A051148 Decimal expansion of BesselK(1,2)/BesselK(0,2).
 * @author Sean A. Irvine
 */
public class A051148 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A051148() {
    super(CR.TWO.besselK(1).divide(CR.TWO.besselK0()));
  }
}
