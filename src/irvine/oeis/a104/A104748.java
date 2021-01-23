package irvine.oeis.a104;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a030.A030798;

/**
 * A104748 Decimal expansion of solution to x*2^x = 1.
 * @author Sean A. Irvine
 */
public class A104748 extends DecimalExpansionSequence {

  private static final CR N = A030798.N.inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}

