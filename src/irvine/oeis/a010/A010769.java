package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010769 Decimal expansion of 7th root of 2.
 * @author Sean A. Irvine
 */
public class A010769 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010769() {
    super(ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 7))));
  }
}
