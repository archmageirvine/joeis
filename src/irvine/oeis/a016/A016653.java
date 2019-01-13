package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016653.
 * @author Sean A. Irvine
 */
public class A016653 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(30).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

