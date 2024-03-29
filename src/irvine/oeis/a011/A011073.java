package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011073 Decimal expansion of 4th root of 82.
 * @author Sean A. Irvine
 */
public class A011073 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011073() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(82), CR.FOUR.inverse()));
  }
}
