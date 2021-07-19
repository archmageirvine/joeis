package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A016705 Decimal expansion of log(82).
 * @author Sean A. Irvine
 */
public class A016705 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016705() {
    super(CR.valueOf(82).log());
  }
}
