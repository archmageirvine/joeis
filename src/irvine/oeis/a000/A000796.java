package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A000796 Decimal expansion of Pi (or digits of Pi).
 * @author Sean A. Irvine
 */
public class A000796 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A000796() {
    this(1);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   */
  public A000796(final int offset) {
    super(offset, CR.PI);
  }
}
