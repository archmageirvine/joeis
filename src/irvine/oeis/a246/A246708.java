package irvine.oeis.a246;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A246708 Decimal expansion of the sixth root of 3.
 * @author Georg Fischer
 */
public class A246708 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A246708() {
    this(1, 6, 3);
  }

  /**
   * Generic constructor with parameters
   * @param offset first index
   * @param root take this root
   * @param base base number
   */
  public A246708(final int offset, final int root, final int base) {
    super(1, CR.valueOf(base).pow(CR.ONE.divide(CR.valueOf(root))));
  }
}
