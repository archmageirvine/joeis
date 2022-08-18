package irvine.oeis.a161;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A161016 Decimal expansion of tan(1/7).
 * @author Sean A. Irvine
 */
public class A161016 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A161016() {
    super(0, ComputableReals.SINGLETON.tan(CR.valueOf(new Q(1, 7))));
  }
}
