package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010767 Decimal expansion of 4th root of 2.
 * @author Sean A. Irvine
 */
public class A010767 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010767() {
    super(ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(Q.ONE_QUARTER)));
  }
}
