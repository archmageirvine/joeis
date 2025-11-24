package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.oeis.a058.A058265;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390750 allocated for Stefano Spezia.
 * @author Sean A. Irvine
 */
public class A390750 extends DecimalExpansionSequence {

  private static final CR T = new A058265().getCR().sqrt();

  /** Construct the sequence. */
  public A390750() {
    super(1, T.add(T.inverse()).add(2));
  }
}
