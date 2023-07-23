package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038009 Values of A038007 not ending in 6 or 8.
 * @author Sean A. Irvine
 */
public class A038009 extends AbstractSequence {

  private final A038007 mSeq1 = new A038007();

  /** Construct the sequence. */
  public A038009() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      final long r = t.mod(10);
      if (r != 6 && r != 8) {
        return t;
      }
    }
  }
}
