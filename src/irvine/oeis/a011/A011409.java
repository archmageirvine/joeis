package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011409 Decimal expansion of 20th root of 18.
 * @author Sean A. Irvine
 */
public class A011409 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011409() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(20).inverse()));
  }
}
