package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A390788.
 * @author Sean A. Irvine
 */
public class A392576 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392576() {
    super(0, CR.THREE.subtract(CR.E).divide(CR.E.subtract(2).multiply(6)));
  }
}
