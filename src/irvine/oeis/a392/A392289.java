package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A392289 Decimal expansion of sqrt((3 - sqrt(7))/2).
 * @author Sean A. Irvine
 */
public class A392289 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392289() {
    super(0, CR.THREE.subtract(CR.SEVEN.sqrt()).divide(CR.TWO).sqrt());
  }
}

