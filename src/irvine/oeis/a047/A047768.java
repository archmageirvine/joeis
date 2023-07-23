package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A047768 a(n) = A047766(6n+2).
 * @author Sean A. Irvine
 */
public class A047768 extends AbstractSequence {

  private final A047766 mSeq1 = new A047766();

  /** Construct the sequence. */
  public A047768() {
    super(0);
  }

  private int mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z t = mSeq1.next();
      if (++mN == 6) {
        mN = 0;
        return t;
      }
    }
  }
}

