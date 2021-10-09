package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011079 Decimal expansion of 4th root of 88.
 * @author Sean A. Irvine
 */
public class A011079 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011079() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(88), CR.FOUR.inverse()));
  }
}
