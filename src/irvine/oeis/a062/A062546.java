package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A062546 Decimal expansion of the 2nd Du Bois-Reymond constant.
 * @author Sean A. Irvine
 */
public class A062546 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A062546() {
    super(CR.TWO.exp().subtract(CR.SEVEN).divide(CR.TWO));
  }
}
