package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002391 Decimal expansion of natural logarithm of 3.
 * @author Sean A. Irvine
 */
public class A002391 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log();

  @Override
  protected CR getCR() {
    return N;
  }
}
