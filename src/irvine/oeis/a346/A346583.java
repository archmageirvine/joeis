package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346583 allocated for Sean A. Irvine.
 * @author Sean A. Irvine
 */
public class A346583 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346583() {
    super(CR.PI.pow(7).multiply(301).divide(CR.THREE.sqrt().multiply(524880)));
  }
}

