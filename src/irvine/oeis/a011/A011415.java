package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011415 Decimal expansion of 11th root of 19.
 * @author Sean A. Irvine
 */
public class A011415 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011415() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(11).inverse()));
  }
}
