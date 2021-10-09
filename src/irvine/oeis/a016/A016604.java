package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016604 Decimal expansion of log(55/2).
 * @author Sean A. Irvine
 */
public class A016604 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016604() {
    super(CR.valueOf(new Q(55, 2)).log());
  }
}
