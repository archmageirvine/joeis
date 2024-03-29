package irvine.oeis.a232;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A232808 Decimal expansion of the surface area of a 3D sphere with unit volume.
 * @author Sean A. Irvine
 */
public class A232808 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A232808() {
    super(ComputableReals.SINGLETON.pow(CR.PI.multiply(36), CR.THREE.inverse()));
  }
}
