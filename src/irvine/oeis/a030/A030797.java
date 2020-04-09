package irvine.oeis.a030;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A030797.
 * @author Sean A. Irvine
 */
public class A030797 extends DecimalExpansionSequence {

  private static final CR N = A030178.N.inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}

