package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395794 Decimal expansion of the moment of inertia of an oloid with unit mass density, formed by two unit circles, about an axis through the center of mass perpendicular to the line connecting the centers of the circles.
 * @author Sean A. Irvine
 */
public class A395794 extends DecimalExpansionSequence {

  private static final CR C = CR.THREE.sqrt().divide(2);

  /** Construct the sequence. */
  public A395794() {
    super(1, CrFunctions.ELLIPTIC_E.cr(C).multiply(new Q(71, 45)).subtract(CrFunctions.ELLIPTIC_K.cr(C).multiply(new Q(19, 90))));
  }
}
