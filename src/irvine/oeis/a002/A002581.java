package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A002581 Decimal expansion of cube root of 3.
 * @author Sean A. Irvine
 */
public class A002581 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002581() {
    super(ComputableReals.SINGLETON.pow(CR.THREE, CR.THREE.inverse()));
  }
}
