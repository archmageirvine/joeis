package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011333 Decimal expansion of 19th root of 13.
 * @author Sean A. Irvine
 */
public class A011333 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011333() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.valueOf(19).inverse()));
  }
}
