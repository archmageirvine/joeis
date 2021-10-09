package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016617 Decimal expansion of log(81/2).
 * @author Sean A. Irvine
 */
public class A016617 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016617() {
    super(CR.valueOf(new Q(81, 2)).log());
  }
}
