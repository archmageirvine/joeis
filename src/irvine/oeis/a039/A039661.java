package irvine.oeis.a039;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A039661 Decimal expansion of exp(Pi).
 * @author Sean A. Irvine
 */
public class A039661 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A039661() {
    super(2, CR.PI.exp());
  }
}
