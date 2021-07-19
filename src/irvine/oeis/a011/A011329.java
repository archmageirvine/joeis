package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011329 Decimal expansion of 15th root of 13.
 * @author Sean A. Irvine
 */
public class A011329 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011329() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.valueOf(15).inverse()));
  }
}
