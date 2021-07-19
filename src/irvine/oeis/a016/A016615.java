package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016615 Decimal expansion of log(77/2).
 * @author Sean A. Irvine
 */
public class A016615 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016615() {
    super(CR.valueOf(new Q(77, 2)).log());
  }
}
