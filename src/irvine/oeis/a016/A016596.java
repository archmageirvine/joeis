package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016596 Decimal expansion of log(39/2).
 * @author Sean A. Irvine
 */
public class A016596 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016596() {
    super(CR.valueOf(new Q(39, 2)).log());
  }
}
