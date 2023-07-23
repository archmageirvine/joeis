package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a006.A006928;

/**
 * A022298 Exactly half of first n terms of A006928 are 1's (not known to be infinite).
 * @author Sean A. Irvine
 */
public class A022298 extends AbstractSequence {

  private final A006928 mSeq1 = new A006928();

  /** Construct the sequence. */
  public A022298() {
    super(0);
  }

  private long mA = 0; // Counts 2 * the number of 1s
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(mSeq1.next())) {
        mA += 2;
      }
      if (Z.ONE.equals(mSeq1.next())) {
        mA += 2;
      }
      mN += 2;
      if (mA == mN) {
        return Z.valueOf(mA);
      }
    }
  }
}
