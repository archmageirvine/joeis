package irvine.oeis.a099;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A099286 Decimal expansion of the error function at 1.
 * @author Sean A. Irvine
 */
public class A099286 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A099286() {
    super(0, CR.ONE.erf());
  }
}
