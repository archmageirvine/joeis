package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004602 Expansion of <code>Pi</code> in base 3.
 * @author Sean A. Irvine
 */
public class A004602 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004602() {
    super(false, 3);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
