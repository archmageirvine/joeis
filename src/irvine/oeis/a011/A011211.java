package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011211 Decimal expansion of 17th root of 5.
 * @author Sean A. Irvine
 */
public class A011211 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011211() {
    super(ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(17).inverse()));
  }
}
