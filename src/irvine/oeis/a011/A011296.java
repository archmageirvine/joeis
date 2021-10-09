package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011296 Decimal expansion of 12th root of 11.
 * @author Sean A. Irvine
 */
public class A011296 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011296() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.valueOf(12).inverse()));
  }
}
