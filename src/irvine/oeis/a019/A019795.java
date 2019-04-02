package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019795.
 * @author Sean A. Irvine
 */
public class A019795 extends DecimalExpansionSequence {

  private static final CR N = CR.E.sqrt().divide(CR.valueOf(22));

  /** Construct the sequence. */
  public A019795() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
