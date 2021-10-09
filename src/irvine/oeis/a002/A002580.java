package irvine.oeis.a002;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A002580 Decimal expansion of cube root of 2.
 * @author Sean A. Irvine
 */
public class A002580 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A002580() {
    super(0, ComputableReals.SINGLETON.pow(CR.TWO, CR.THREE.inverse()));
  }
}
