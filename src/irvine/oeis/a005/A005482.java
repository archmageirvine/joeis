package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A005482 Decimal expansion of cube root of 7.
 * @author Sean A. Irvine
 */
public class A005482 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A005482() {
    super(ComputableReals.SINGLETON.pow(CR.SEVEN, CR.THREE.inverse()));
  }
}
