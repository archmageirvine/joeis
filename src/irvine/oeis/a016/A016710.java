package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016710.
 * @author Sean A. Irvine
 */
public class A016710 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(87).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
