package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011255 Decimal expansion of 16th root of 8.
 * @author Sean A. Irvine
 */
public class A011255 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011255() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.valueOf(16).inverse()));
  }
}
