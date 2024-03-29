package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011349 Decimal expansion of 20th root of 14.
 * @author Sean A. Irvine
 */
public class A011349 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011349() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(20).inverse()));
  }
}
