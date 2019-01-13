package irvine.oeis.a098;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A098317.
 * @author Sean A. Irvine
 */
public class A098317 extends DecimalExpansionSequence {

  private static final CR N = CR.TWO.add(CR.FIVE.sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
