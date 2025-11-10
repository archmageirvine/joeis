package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390212 Decimal expansion of 197/1728 - (3/32) * zeta(3).
 * @author Sean A. Irvine
 */
public class A390212 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A390212() {
    super(0, CR.valueOf(new Q(197, 1728)).subtract(Zeta.zeta(3).multiply(3).divide(32)));
  }
}
