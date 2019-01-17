package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016711.
 * @author Sean A. Irvine
 */
public class A016711 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(88).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
