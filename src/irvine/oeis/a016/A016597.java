package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016597 Decimal expansion of log(41/2).
 * @author Sean A. Irvine
 */
public class A016597 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016597() {
    super(CR.valueOf(new Q(41, 2)).log());
  }
}
