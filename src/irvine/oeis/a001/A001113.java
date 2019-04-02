package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A001113 Decimal expansion of e.
 * @author Sean A. Irvine
 */
public class A001113 extends DecimalExpansionSequence {

  @Override
  protected CR getCR() {
    return CR.E;
  }
}
