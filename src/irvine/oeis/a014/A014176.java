package irvine.oeis.a014;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A014176.
 * @author Sean A. Irvine
 */
public class A014176 extends DecimalExpansionSequence {

  private static final CR N = CR.ONE.add(CR.SQRT2);

  @Override
  protected CR getCR() {
    return N;
  }
}
