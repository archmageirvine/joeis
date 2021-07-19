package irvine.oeis.a156;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A156035 Decimal expansion of 3 + 2*sqrt(2).
 * @author Sean A. Irvine
 */
public class A156035 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A156035() {
    super(CR.THREE.add(CR.EIGHT.sqrt()));
  }
}
