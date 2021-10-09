package irvine.oeis.a016;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A016665 Decimal expansion of log(42).
 * @author Sean A. Irvine
 */
public class A016665 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A016665() {
    super(CR.valueOf(42).log());
  }
}
