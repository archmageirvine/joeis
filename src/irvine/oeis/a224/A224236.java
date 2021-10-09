package irvine.oeis.a224;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A224236 Decimal expansion of speed of light in feet per second.
 * The exact value (by definition) is 299792458/0.3048.
 * @author Georg Fischer
 */
public class A224236 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A224236() {
    super(CR.valueOf(new Q(2997924580000L, 3048L)));
  }
}
