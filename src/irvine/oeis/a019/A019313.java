package irvine.oeis.a019;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A019313 e + 2 Pi.
 * @author Sean A. Irvine
 */
public class A019313 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A019313() {
    super(CR.E.add(CR.TAU));
  }
}
