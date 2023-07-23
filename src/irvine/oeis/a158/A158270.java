package irvine.oeis.a158;
// manually 2021-07-05

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a061.A061049;

/**
 * A158270 Single-digit numbers in A061049.
 * @author Georg Fischer
 */
public class A158270 extends AbstractSequence {

  private final A061049 mSeq1 = new A061049();

  /** Construct the sequence. */
  public A158270() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z term = mSeq1.next();
      if (term.compareTo(Z.TEN) < 0) {
        return term;
      }
    }
  }
}
