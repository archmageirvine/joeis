package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011258 Decimal expansion of 19th root of 8.
 * @author Sean A. Irvine
 */
public class A011258 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011258() {
    super(ComputableReals.SINGLETON.pow(CR.EIGHT, CR.valueOf(19).inverse()));
  }
}
