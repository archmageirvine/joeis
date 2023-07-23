package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A028274 Odd elements (greater than 1) to right of central elements in 3-Pascal triangle A028262.
 * @author Sean A. Irvine
 */
public class A028274 extends AbstractSequence {

  private final A028272 mSeq1 = new A028272();

  /** Construct the sequence. */
  public A028274() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (t.isOdd()) {
        return t;
      }
    }
  }
}
