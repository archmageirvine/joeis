package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011300 Decimal expansion of 16th root of 11.
 * @author Sean A. Irvine
 */
public class A011300 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011300() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(11), CR.valueOf(16).inverse()));
  }
}
