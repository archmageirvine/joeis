package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389851 Decimal expansion of the largest dihedral angle, in radians, in an augmented dodecahedron (Johnson solid J_58).
 * @author Sean A. Irvine
 */
public class A389851 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389851() {
    super(1, ComputableReals.SINGLETON.acos(CR.valueOf(65).subtract(CR.FIVE.sqrt().multiply(2)).divide(75).sqrt().negate()));
  }
}
