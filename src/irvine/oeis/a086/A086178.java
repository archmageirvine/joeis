package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A086178.
 * @author Sean A. Irvine
 */
public class A086178 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.add(CR.valueOf(8).sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
