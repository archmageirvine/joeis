package irvine.oeis.a394;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A394756 Decimal expansion of (6*sqrt(3) - Pi)/24.
 * @author Sean A. Irvine
 */
public class A394756 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A394756() {
    super(0, CR.THREE.sqrt().multiply(6).subtract(CR.PI).divide(24));
  }
}
