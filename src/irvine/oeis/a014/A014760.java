package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A014760 Squares of numbers in array formed from odd elements to the right of middle of rows of Pascal triangle that are not 1.
 * @author Sean A. Irvine
 */
public class A014760 extends AbstractSequence {

  private final A014475 mSeq1 = new A014475();

  /** Construct the sequence. */
  public A014760() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (t.isOdd() && !Z.ONE.equals(t)) {
        return t.square();
      }
    }
  }
}
