package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395479 Decimal expansion of 1135547732074278753 / 46505268690923380.
 * @author Sean A. Irvine
 */
public class A395479 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395479() {
    super(2, CR.valueOf(new Q(1135547732074278753L, 46505268690923380L)));
  }
}

