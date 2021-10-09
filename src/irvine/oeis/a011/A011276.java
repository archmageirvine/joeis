package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011276 Decimal expansion of 7th root of 10.
 * @author Sean A. Irvine
 */
public class A011276 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011276() {
    super(ComputableReals.SINGLETON.pow(CR.TEN, CR.SEVEN.inverse()));
  }
}
