package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011194 Decimal expansion of 15th root of 4.
 * @author Sean A. Irvine
 */
public class A011194 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011194() {
    super(ComputableReals.SINGLETON.pow(CR.FOUR, CR.valueOf(15).inverse()));
  }
}
