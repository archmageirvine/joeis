package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010777 Decimal expansion of 15th root of 2.
 * @author Sean A. Irvine
 */
public class A010777 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010777() {
    super(ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 15))));
  }
}
