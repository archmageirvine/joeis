package irvine.oeis.a389;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A389109 Decimal expansion of the smallest dihedral angle, in radians, in a gyroelongated pentagonal pyramid (Johnson solid J_11).
 * @author Sean A. Irvine
 */
public class A389109 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A389109() {
    super(1, ComputableReals.SINGLETON.acos(CR.FIVE.subtract(CR.FIVE.sqrt().multiply(2)).divide(15).sqrt().negate()));
  }
}

