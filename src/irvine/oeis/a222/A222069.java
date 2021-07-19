package irvine.oeis.a222;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A222069 Decimal expansion of (1/30)*2^(1/2)*Pi^2.
 * @author Sean A. Irvine
 */
public class A222069 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A222069() {
    super(CR.PI.multiply(CR.PI).multiply(CR.SQRT2).divide(CR.valueOf(30)));
  }
}
