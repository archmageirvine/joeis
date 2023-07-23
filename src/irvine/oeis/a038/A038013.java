package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038013 Values of A038005 ending in 3.
 * @author Sean A. Irvine
 */
public class A038013 extends AbstractSequence {

  private final A038007 mSeq1 = new A038007();

  /** Construct the sequence. */
  public A038013() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (t.mod(10) == 3) {
        return t;
      }
    }
  }
}
