package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390640 allocated for Michal Paulovic.
 * @author Sean A. Irvine
 */
public class A390640 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A390640() {
    super(2, CR.valueOf(72).divide(CR.SEVEN.log()));
  }
}
