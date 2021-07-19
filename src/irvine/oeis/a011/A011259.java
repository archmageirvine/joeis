package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011259 Decimal expansion of 20th root of 8.
 * @author Sean A. Irvine
 */
public class A011259 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011259() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.valueOf(20).inverse()));
  }
}
