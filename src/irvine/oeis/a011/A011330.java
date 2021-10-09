package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011330 Decimal expansion of 16th root of 13.
 * @author Sean A. Irvine
 */
public class A011330 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011330() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.valueOf(16).inverse()));
  }
}
