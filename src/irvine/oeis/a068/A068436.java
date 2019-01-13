package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068436.
 * @author Sean A. Irvine
 */
public class A068436 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068436() {
    super(false, 11);
  }

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
