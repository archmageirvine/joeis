package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073003.
 * @author Sean A. Irvine
 */
public class A073003 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.negate().ei().negate().multiply(CR.E);

  @Override
  protected CR getCR() {
    return N;
  }
}
