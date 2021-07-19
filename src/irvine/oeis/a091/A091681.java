package irvine.oeis.a091;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A091681 Decimal expansion of BesselJ(0,2).
 * @author Sean A. Irvine
 */
public class A091681 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A091681() {
    super(CR.TWO.besselJ0());
  }
}
