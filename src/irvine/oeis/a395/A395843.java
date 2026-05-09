package irvine.oeis.a395;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A395605 allocated for Simone Cammarasana.
 * @author Sean A. Irvine
 */
public class A395843 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A395843() {
    super(0, CR.THREE.log().multiply(3).add(4).divide(CR.THREE.sqrt().multiply(12)));
  }
}
