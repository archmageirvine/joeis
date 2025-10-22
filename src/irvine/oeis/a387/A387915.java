package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.math.cr.Zeta;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387915 allocated for Jason Bard.
 * @author Sean A. Irvine
 */
public class A387915 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387915() {
    super(0, Zeta.zeta(3).multiply(91).subtract(CR.PI.pow(3).multiply(CR.THREE.sqrt()).multiply(2)).divide(1728));
  }
}

