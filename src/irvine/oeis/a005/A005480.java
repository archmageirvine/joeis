package irvine.oeis.a005;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A005480 Decimal expansion of cube root of 4.
 * @author Sean A. Irvine
 */
public class A005480 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A005480() {
    super(ComputableReals.SINGLETON.pow(CR.FOUR, CR.THREE.inverse()));
  }
}
