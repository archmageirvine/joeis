package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016672 Decimal expansion of log(49).
 * @author Sean A. Irvine
 */
public class A016672 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016672() {
    super(CR.valueOf(49).log());
  }
}
