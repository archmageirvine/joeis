package irvine.oeis.a187;

import irvine.math.cr.OtterConstants;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A187770 Decimal expansion of Otter's asymptotic constant beta for the number of rooted trees.
 * @author Sean A. Irvine
 */
public class A187770 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A187770() {
    super(0, new OtterConstants().bConstant());
  }
}

