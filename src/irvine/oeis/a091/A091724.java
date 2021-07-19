package irvine.oeis.a091;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A091724 Decimal expansion of e^(2*EulerGamma).
 * @author Sean A. Irvine
 */
public class A091724 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A091724() {
    super(CR.GAMMA.multiply(CR.TWO).exp());
  }
}
