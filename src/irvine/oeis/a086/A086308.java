package irvine.oeis.a086;

import irvine.math.cr.OtterConstants;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086308 Decimal expansion of Otter's asymptotic constant beta for the number of unrooted trees.
 * @author Sean A. Irvine
 */
public class A086308 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A086308() {
    super(0, new OtterConstants().beta());
  }
}

