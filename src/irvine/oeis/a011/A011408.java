package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011408 Decimal expansion of 19th root of 18.
 * @author Sean A. Irvine
 */
public class A011408 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011408() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(19).inverse()));
  }
}
