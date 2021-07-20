package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346450 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A346450 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346450() {
    super(CR.PI.pow(6).multiply(1681).divide(CR.THREE.sqrt().multiply(933120)));
  }
}

