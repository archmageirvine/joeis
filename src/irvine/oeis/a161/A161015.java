package irvine.oeis.a161;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A161015 Decimal expansion of tan(1/6).
 * @author Sean A. Irvine
 */
public class A161015 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A161015() {
    super(ComputableReals.SINGLETON.tan(CR.valueOf(new Q(1, 6))));
  }
}
