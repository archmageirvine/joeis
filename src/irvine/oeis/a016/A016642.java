package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016642.
 * @author Sean A. Irvine
 */
public class A016642 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(19).log();

  @Override
  protected CR getCR() {
    return N;
  }
}

