package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A222070 Decimal expansion of (1/144)*3^(1/2)*Pi^3.
 * @author Sean A. Irvine
 */
public class A222070 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A222070() {
    super(0, CR.PI.multiply(CR.PI).multiply(CR.PI).multiply(CR.THREE.sqrt()).divide(CR.valueOf(144)));
  }
}
