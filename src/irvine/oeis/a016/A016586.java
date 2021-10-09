package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016586 Decimal expansion of log(19/2).
 * @author Sean A. Irvine
 */
public class A016586 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016586() {
    super(CR.valueOf(new Q(19, 2)).log());
  }
}
