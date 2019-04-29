package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020791.
 * @author Sean A. Irvine
 */
public class A020791 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(34).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
