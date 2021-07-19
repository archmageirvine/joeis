package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010768 Decimal expansion of 6th root of 2.
 * @author Sean A. Irvine
 */
public class A010768 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010768() {
    super(ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 6))));
  }
}
