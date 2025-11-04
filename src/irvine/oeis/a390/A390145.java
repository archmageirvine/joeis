package irvine.oeis.a390;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.DecimalExpansionSequence;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A390145 Decimal expansion of the largest dihedral angle, in radians, in a snub disphenoid (Johnson solid J_84).
 * @author Sean A. Irvine
 */
public class A390145 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A390145() {
    super(1, ComputableReals.SINGLETON.acos(new PolynomialRootExpansionSequence(Polynomial.create(44, -24, -45, 27), CR.NEG_ONE, CR.ZERO).getCR()));
  }
}

