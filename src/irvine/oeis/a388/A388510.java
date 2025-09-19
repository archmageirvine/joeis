package irvine.oeis.a388;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A388510 Decimal expansion of 2^(-1/8).
 * @author Sean A. Irvine
 */
public class A388510 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A388510() {
    super(0, CR.TWO.pow(new Q(-1, 8)));
  }
}
