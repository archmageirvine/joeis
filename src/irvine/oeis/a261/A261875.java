package irvine.oeis.a261;

import irvine.math.cr.OtterConstants;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A261875 Decimal expansion of the coefficient 'gamma' (see formula) appearing in Otter's result concerning the asymptotics of T_n, the number of non-isomorphic rooted trees of order n.
 * @author Sean A. Irvine
 */
public class A261875 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A261875() {
    super(1, new OtterConstants().gamma());
  }
}

