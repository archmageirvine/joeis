package irvine.oeis.a004;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A004543.
 * @author Sean A. Irvine
 */
public class A004543 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A004543() {
    super(false, 6);
  }

  @Override
  protected CR getCR() {
    return CR.SQRT2;
  }
}
