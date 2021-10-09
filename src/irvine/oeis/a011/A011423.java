package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011423 Decimal expansion of 19th root of 19.
 * @author Sean A. Irvine
 */
public class A011423 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011423() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(19).inverse()));
  }
}
