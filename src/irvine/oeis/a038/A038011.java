package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A038011 Values of A038007 ending in 2.
 * @author Sean A. Irvine
 */
public class A038011 extends AbstractSequence {

  private final A038007 mSeq1 = new A038007();

  /** Construct the sequence. */
  public A038011() {
    super(0);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (t.mod(10) == 2) {
        return t;
      }
    }
  }
}
