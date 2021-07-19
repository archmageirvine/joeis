package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016618 Decimal expansion of log(83/2).
 * @author Sean A. Irvine
 */
public class A016618 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016618() {
    super(CR.valueOf(new Q(83, 2)).log());
  }
}
