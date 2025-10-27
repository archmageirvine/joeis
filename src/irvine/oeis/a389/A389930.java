package irvine.oeis.a389;

import irvine.oeis.a137.A137914;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389930 Decimal expansion of the largest dihedral angle, in radians, in an augmented tridiminished icosahedron (Johnson solid J_64).
 * @author Sean A. Irvine
 */
public class A389930 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389930() {
    super(1, new A389109().getCR().add(new A137914().getCR()));
  }
}

