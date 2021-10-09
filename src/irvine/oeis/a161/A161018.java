package irvine.oeis.a161;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A161018 Decimal expansion of tan(1/9).
 * @author Sean A. Irvine
 */
public class A161018 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A161018() {
    super(ComputableReals.SINGLETON.tan(CR.valueOf(new Q(1, 9))));
  }
}
