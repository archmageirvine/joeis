package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016636.
 * @author Sean A. Irvine
 */
public class A016636 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

