package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011229 Decimal expansion of 20th root of 6.
 * @author Sean A. Irvine
 */
public class A011229 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011229() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(20).inverse()));
  }
}
