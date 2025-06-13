package irvine.oeis.a384;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A384683 Decimal expansion of Sum_{i &gt;= 1} 1/(3*i-1) - 1/(3*i).
 * @author Sean A. Irvine
 */
public class A384683 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A384683() {
    super(0, CR.THREE.log().multiply(CR.HALF).subtract(CR.THREE.sqrt().multiply(CR.PI).divide(18)));
  }
}

