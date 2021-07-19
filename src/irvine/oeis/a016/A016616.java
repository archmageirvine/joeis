package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016616 Decimal expansion of log(79/2).
 * @author Sean A. Irvine
 */
public class A016616 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016616() {
    super(CR.valueOf(new Q(79, 2)).log());
  }
}
