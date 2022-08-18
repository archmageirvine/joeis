package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020760 Decimal expansion of 1/sqrt(3).
 * @author Sean A. Irvine
 */
public class A020760 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020760() {
    super(0, CR.THREE.sqrt().inverse());
  }
}
