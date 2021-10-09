package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011433 Decimal expansion of 14th root of 20.
 * @author Sean A. Irvine
 */
public class A011433 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011433() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(20), CR.valueOf(14).inverse()));
  }
}
