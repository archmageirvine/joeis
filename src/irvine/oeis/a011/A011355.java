package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011355 Decimal expansion of 11th root of 15.
 * @author Sean A. Irvine
 */
public class A011355 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011355() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(15), CR.valueOf(11).inverse()));
  }
}
