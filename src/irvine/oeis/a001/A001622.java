package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A001622.
 * @author Sean A. Irvine
 */
public class A001622 extends DecimalExpansionSequence {

  @Override
  protected CR getCR() {
    return CR.PHI;
  }
}
