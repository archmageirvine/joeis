package irvine.oeis.a383;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A383267 Decimal expansion of (4/11)^(1/3).
 * @author Sean A. Irvine
 */
public class A383267 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A383267() {
    super(0, CR.valueOf(new Q(4, 11)).pow(Q.ONE_THIRD));
  }
}
