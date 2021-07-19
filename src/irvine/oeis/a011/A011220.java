package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011220 Decimal expansion of 11th root of 6.
 * @author Sean A. Irvine
 */
public class A011220 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011220() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(11).inverse()));
  }
}
