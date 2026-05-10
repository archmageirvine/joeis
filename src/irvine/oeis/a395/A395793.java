package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.math.cr.functions.CrFunctions;
import irvine.math.q.Q;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395793 Decimal expansion of the principal moment of inertia of an oloid with unit mass density, formed by two unit circles, about the axis passing through the centers of the circles.
 * @author Sean A. Irvine
 */
public class A395793 extends DecimalExpansionSequence {

  private static final CR C = CR.THREE.sqrt().divide(2);

  /** Construct the sequence. */
  public A395793() {
    super(0, CrFunctions.ELLIPTIC_E.cr(C).multiply(new Q(32, 45)).subtract(CrFunctions.ELLIPTIC_K.cr(C).multiply(new Q(2, 45))));
  }
}
