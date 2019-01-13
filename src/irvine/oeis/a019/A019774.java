package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019774.
 * @author Sean A. Irvine
 */
public class A019774 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
