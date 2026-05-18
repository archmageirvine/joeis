package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.oeis.a030.A030178;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394429 allocated for Samuel Box.
 * @author Sean A. Irvine
 */
public class A394429 extends DecimalExpansionSequence {

  private static final CR W = new A030178().getCR();

  /** Construct the sequence. */
  public A394429() {
    super(1, W.multiply(W.add(2)).multiply(-4).add(8));
  }
}

