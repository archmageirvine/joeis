package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389557 Decimal expansion of the largest dihedral angle, in radians, in an augmented hexagonal prism (Johnson solid J_54).
 * @author Sean A. Irvine
 */
public class A389557 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389557() {
    super(1, ComputableReals.SINGLETON.atan(CR.SQRT2).add(CR.TAU.divide(3)));
  }
}
