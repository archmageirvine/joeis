package irvine.oeis.a377;
// Generated by gen_seq4.pl 2025-02-06.ack/decexp at 2025-02-06 23:16

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A377602 Decimal expansion of the surface area of a snub cube (snub cuboctahedron) with unit edge length.
 * Formula:
 * @author Georg Fischer
 */
public class A377602 extends DecimalExpansionSequence {

  /** Construct the sequence */
  public A377602() {
    super(2, CR.SIX.add(CR.EIGHT.multiply(CR.THREE.sqrt())));
  }
}
