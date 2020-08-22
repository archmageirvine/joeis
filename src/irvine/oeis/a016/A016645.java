package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016645 Decimal expansion of log(22).
 * @author Sean A. Irvine
 */
public class A016645 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(22).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

