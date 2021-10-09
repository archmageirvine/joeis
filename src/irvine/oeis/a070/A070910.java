package irvine.oeis.a070;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A070910 Decimal expansion of BesselI(0,2).
 * @author Sean A. Irvine
 */
public class A070910 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A070910() {
    super(CR.TWO.besselI0());
  }
}
