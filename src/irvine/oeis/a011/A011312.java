package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011312 Decimal expansion of 13th root of 12.
 * @author Sean A. Irvine
 */
public class A011312 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011312() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(13).inverse()));
  }
}
