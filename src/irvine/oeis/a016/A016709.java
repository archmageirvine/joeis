package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016709.
 * @author Sean A. Irvine
 */
public class A016709 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(86).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
