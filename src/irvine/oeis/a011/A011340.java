package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011340 Decimal expansion of 11th root of 14.
 * @author Sean A. Irvine
 */
public class A011340 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011340() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(11).inverse()));
  }
}
