package irvine.oeis.a361;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A361260 Maximum latitude in degrees of spherical Mercator projection with an aspect ratio of one, arctan(sinh(Pi))*180/Pi.
 * @author Sean A. Irvine
 */
public class A361260 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A361260() {
    super(2, ComputableReals.SINGLETON.atan(CR.PI.sinh()).multiply(180).divide(CR.PI));
  }
}
