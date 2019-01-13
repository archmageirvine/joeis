package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016650.
 * @author Sean A. Irvine
 */
public class A016650 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(27).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

