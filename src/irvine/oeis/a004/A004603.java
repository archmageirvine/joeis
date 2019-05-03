package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004603 Expansion of <code>Pi</code> in base 4.
 * @author Sean A. Irvine
 */
public class A004603 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004603() {
    super(false, 4);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
