package irvine.oeis.a224;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A224238 Decimal expansion of speed of light in miles per hour.
 * The exact answer (by definition) is 3600*299792458/(5280*0.3048).
 * @author Georg Fischer
 */
public class A224238 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A224238() {
    super(9, CR.valueOf(new Q(3600L * 299792458L * 10000L, 5280L * 3048L)));
  }
}
