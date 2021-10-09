package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011319 Decimal expansion of 20th root of 12.
 * @author Sean A. Irvine
 */
public class A011319 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011319() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(20).inverse()));
  }
}
