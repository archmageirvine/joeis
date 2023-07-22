package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a001.A001203;

/**
 * A048959 Positions of 4-digit terms in the continued fraction for Pi (3 is at position 0).
 * @author Sean A. Irvine
 */
public class A048959 extends AbstractSequence {

  private final A001203 mSeq = new A001203();
  private static final Z LOWER = Z.valueOf(1000);
  private static final Z UPPER = Z.valueOf(10000);
  private long mM = -1;

  /** Construct the sequence. */
  public A048959() {
    super(1);
  }

  @Override
  public Z next() {
    while (true) {
      ++mM;
      final Z t = mSeq.next();
      if (t.compareTo(LOWER) >= 0 && t.compareTo(UPPER) < 0) {
        return Z.valueOf(mM);
      }
    }
  }
}
