package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020786.
 * @author Sean A. Irvine
 */
public class A020786 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(29).sqrt().inverse();

  @Override
  protected CR getCR() {
    return N;
  }
}
