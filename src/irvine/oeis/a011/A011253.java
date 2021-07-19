package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011253 Decimal expansion of 14th root of 8.
 * @author Sean A. Irvine
 */
public class A011253 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011253() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.valueOf(14).inverse()));
  }
}
