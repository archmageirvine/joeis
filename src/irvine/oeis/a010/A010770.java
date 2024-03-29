package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A010770 Decimal expansion of 8th root of 2.
 * @author Sean A. Irvine
 */
public class A010770 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010770() {
    super(ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 8))));
  }
}
