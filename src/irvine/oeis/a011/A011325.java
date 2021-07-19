package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011325 Decimal expansion of 11th root of 13.
 * @author Sean A. Irvine
 */
public class A011325 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011325() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.valueOf(11).inverse()));
  }
}
