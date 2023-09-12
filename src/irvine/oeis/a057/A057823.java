package irvine.oeis.a057;

import irvine.oeis.a211.A211342;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A057823 Decimal expansion of q = 0.193072033..., which is the value of q which gives the maximum of the Dedekind eta function eta(q) := q^(1/12) * Product_{n&gt;=1} (1 - q^(2n)) for q between 0 and 1.
 * @author Sean A. Irvine
 */
public class A057823 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A057823() {
    super(0, A211342.ETA_CONSTANT.sqrt());
  }
}
