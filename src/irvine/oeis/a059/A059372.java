package irvine.oeis.a059;

import irvine.oeis.transform.RevertTransformSequence;
import irvine.oeis.a000.A000142;

/**
 * A059372 Revert transform of factorials n! (n &gt;= 1).
 *
 * @author Georg Fischer
 */
public class A059372 extends RevertTransformSequence {

  /**
   * Construct the sequence
   */
  public A059372() {
    super(new A000142());
    mSeq.next();
  }
}
