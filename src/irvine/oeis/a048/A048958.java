package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001203;

/**
 * A048958 4-digit terms in the continued fraction for Pi.
 * @author Sean A. Irvine
 */
public class A048958 extends AbstractSequence {

  private final A001203 mSeq = new A001203();
  private static final Z LOWER = Z.valueOf(1000);
  private static final Z UPPER = Z.valueOf(10000);

  /** Construct the sequence. */
  public A048958() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq.next();
      if (t.compareTo(LOWER) >= 0 && t.compareTo(UPPER) < 0) {
        return t;
      }
    }
  }
}
