package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387300 Decimal expansion of Sum_{n&gt;=1} (-1)^(n+1) P(2*n)/(2*n), where P(x) is the prime zeta function.
 * @author Sean A. Irvine
 */
public class A387300 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387300() {
    super(0, CR.valueOf(15).sqrt().divide(CR.PI).log());
  }
}

