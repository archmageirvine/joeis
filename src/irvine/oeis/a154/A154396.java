package irvine.oeis.a154;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A154396.
 * @author Sean A. Irvine
 */
public class A154396 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log().divide(CR.valueOf(14).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
