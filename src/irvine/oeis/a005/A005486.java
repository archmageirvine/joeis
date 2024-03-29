package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A005486 Decimal expansion of cube root of 6.
 * @author Sean A. Irvine
 */
public class A005486 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A005486() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.THREE.inverse()));
  }
}
