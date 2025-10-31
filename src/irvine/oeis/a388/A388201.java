package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388201 Decimal expansion of (1/398) * (235 + 17 * sqrt(293)).
 * @author Sean A. Irvine
 */
public class A388201 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388201() {
    super(1, CR.valueOf(293).sqrt().multiply(17).add(235).divide(398));
  }
}

