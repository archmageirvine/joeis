package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016669 Decimal expansion of log(46).
 * @author Sean A. Irvine
 */
public class A016669 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(46).log();

  @Override
  protected CR getCR() {
    return N;
  }
}
