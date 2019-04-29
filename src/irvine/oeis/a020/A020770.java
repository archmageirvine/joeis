package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020770.
 * @author Sean A. Irvine
 */
public class A020770 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(13).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
