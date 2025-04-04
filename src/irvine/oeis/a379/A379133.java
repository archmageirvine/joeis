package irvine.oeis.a379;
// Generated by gen_seq4.pl 2024-12-30.ack/decexp at 2024-12-30 19:33

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A379133 Decimal expansion of the volume of a pentakis dodecahedron with unit shorter edge length.
 * Formula: (5/36)*(41 + 25*sqrt(5))
 * @author Georg Fischer
 */
public class A379133 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A379133() {
    super(2, CR.valueOf(new Q(5, 36)).multiply(CR.FIVE.sqrt().multiply(25).add(41)));
  }
}
