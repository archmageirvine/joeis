package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011331 Decimal expansion of 17th root of 13.
 * @author Sean A. Irvine
 */
public class A011331 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011331() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.valueOf(17).inverse()));
  }
}
