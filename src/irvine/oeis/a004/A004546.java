package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004546 Expansion of <code>sqrt(2)</code> in base 9.
 * @author Sean A. Irvine
 */
public class A004546 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004546() {
    super(false, 9);
  }

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }
}
