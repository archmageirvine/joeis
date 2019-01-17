package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016719.
 * @author Sean A. Irvine
 */
public class A016719 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(96).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
