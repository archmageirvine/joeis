package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016648.
 * @author Sean A. Irvine
 */
public class A016648 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(25).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

