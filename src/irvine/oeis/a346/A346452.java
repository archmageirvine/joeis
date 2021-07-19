package irvine.oeis.a346;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A346452.
 * @author Sean A. Irvine
 */
public class A346452 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A346452() {
    super(CR.PI.pow(2).divide(CR.THREE.sqrt().multiply(6)));
  }
}

