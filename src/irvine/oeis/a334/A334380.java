package irvine.oeis.a334;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A334380 Decimal expansion of Sum_{k&gt;=0} (-1)^k/((2*k)!!)^2.
 * @author Sean A. Irvine
 */
public class A334380 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A334380() {
    super(CR.ONE.besselJ0());
  }
}
