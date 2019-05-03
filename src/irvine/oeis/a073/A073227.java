package irvine.oeis.a073;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A073227 Decimal expansion of <code>e^e^e</code>.
 * @author Sean A. Irvine
 */
public class A073227 extends DecimalExpansionSequence {

  private static final CR N = CR.E.exp().exp();

  /** Construct the sequence. */
  public A073227() {
    super(false);
  }

  @Override
  protected CR getCR() {
    return N;
  }
}
