package irvine.oeis.a038;

import irvine.oeis.FiniteSequence;

/**
 * A038378 Integers which have more distinct digits than any smaller number.
 * @author Georg Fischer
 */
public class A038378 extends FiniteSequence {

  /** Construct the sequence. */
  public A038378() {
    super(0, 10, 102, 1023, 10234, 102345, 1023456, 10234567, 102345678L, 1023456789L);
  }
}
