package irvine.oeis.a392;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A083029.
 * @author Sean A. Irvine
 */
public class A392289 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A392289() {
    super(0, CR.THREE.subtract(CR.valueOf(7).sqrt()).divide(CR.TWO).sqrt());
  }
}

