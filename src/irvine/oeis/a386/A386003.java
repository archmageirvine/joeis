package irvine.oeis.a386;
// Generated by gen_seq4.pl 2025-07-25.ack/decexp at 2025-07-25 21:47

import irvine.math.cr.CR;
import irvine.oeis.a102.A102771;
import irvine.oeis.a120.A120011;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A386003 Decimal expansion of the surface area of an augmented tridiminished icosahedron with unit edge.
 * Formula:
 * @author Georg Fischer
 */
public class A386003 extends DecimalExpansionSequence {

  private static final DecimalExpansionSequence A102771 = new A102771();
  private static final DecimalExpansionSequence A120011 = new A120011();

  /** Construct the sequence */
  public A386003() {
    super(1, CR.THREE.multiply(A102771.getCR()).add(CR.SEVEN.multiply(A120011.getCR())));
  }
}
