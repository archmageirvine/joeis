package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010781 Decimal expansion of 19th root of 2.
 * @author Sean A. Irvine
 */
public class A010781 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010781() {
    super(ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 19))));
  }
}
