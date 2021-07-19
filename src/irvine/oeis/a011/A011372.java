package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011372 Decimal expansion of 13th root of 16.
 * @author Sean A. Irvine
 */
public class A011372 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011372() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(16), CR.valueOf(13).inverse()));
  }
}
