package irvine.oeis.a242;
// manually 2022-08-27

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A242909 Decimal expansion of exp(-gamma/2).
 * @author Georg Fischer
 */
public class A242909 extends DecimalExpansionSequence {

  private static final ComputableReals REALS = ComputableReals.SINGLETON;

  /** Construct the sequence. */
  public A242909() {
    super(0, CR.GAMMA.divide(CR.TWO).negate().exp());
  }
}
