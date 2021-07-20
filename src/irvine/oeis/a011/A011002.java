package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011002 Decimal expansion of 4th root of 3.
 * @author Sean A. Irvine
 */
public class A011002 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011002() {
    super(ComputableReals.SINGLETON.pow(CR.THREE, CR.FOUR.inverse()));
  }
}
