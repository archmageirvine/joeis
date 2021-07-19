package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011363 Decimal expansion of 19th root of 15.
 * @author Sean A. Irvine
 */
public class A011363 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011363() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.valueOf(19).inverse()));
  }
}
