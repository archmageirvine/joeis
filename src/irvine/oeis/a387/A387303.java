package irvine.oeis.a387;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A387303 Decimal expansion of Sum_{n&gt;=1} (-1)^(n+1) P(4*n)/(4*n), where P(x) is the prime zeta function.
 * @author Sean A. Irvine
 */
public class A387303 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A387303() {
    super(0, CR.valueOf(105).sqrt().sqrt().divide(CR.PI).log());
  }
}

