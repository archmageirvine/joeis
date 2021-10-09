package irvine.oeis.a161;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A161013 Decimal expansion of tan(1/4).
 * @author Sean A. Irvine
 */
public class A161013 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A161013() {
    super(ComputableReals.SINGLETON.tan(CR.valueOf(new Q(1, 4))));
  }
}
