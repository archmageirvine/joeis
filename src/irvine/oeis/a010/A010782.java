package irvine.oeis.a010;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A010782 Decimal expansion of 20th root of 2.
 * @author Sean A. Irvine
 */
public class A010782 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A010782() {
    super(ComputableReals.SINGLETON.pow(CR.TWO, CR.valueOf(new Q(1, 20))));
  }
}
