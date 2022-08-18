package irvine.oeis.a333;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A333419 Decimal expansion of the error function at 1/2, erf(1/2).
 * @author Sean A. Irvine
 */
public class A333419 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A333419() {
    super(0, CR.HALF.erf());
  }
}
