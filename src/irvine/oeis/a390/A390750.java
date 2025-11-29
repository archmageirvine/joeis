package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.oeis.a058.A058265;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390750 Decimal expansion of 2 + sqrt(A058265) + 1/sqrt(A058265).
 * @author Sean A. Irvine
 */
public class A390750 extends DecimalExpansionSequence {

  private static final CR T = new A058265().getCR().sqrt();

  /** Construct the sequence. */
  public A390750() {
    super(1, T.add(T.inverse()).add(2));
  }
}
