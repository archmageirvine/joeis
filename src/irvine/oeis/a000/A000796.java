package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A000796.
 * @author Sean A. Irvine
 */
public class A000796 extends DecimalExpansionSequence {

  @Override
  protected CR getCR() {
    return CR.PI;
  }
}
