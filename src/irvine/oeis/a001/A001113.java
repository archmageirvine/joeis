package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A001113 Decimal expansion of e.
 * @author Sean A. Irvine
 */
public class A001113 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A001113() {
    this(1);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  public A001113(final int offset) {
    super(offset, CR.E);
  }
}
