package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A062964 <code>Pi</code> in hexadecimal.
 * @author Sean A. Irvine
 */
public class A062964 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A062964() {
    super(false, 16);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
