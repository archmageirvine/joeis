package irvine.oeis.a022;

import irvine.math.z.Z;

/**
 * A022305 Exactly half the first a(n) terms of A022303 are 1's.
 * @author Sean A. Irvine
 */
public class A022305 extends A022303 {

  /** Construct the sequence. */
  public A022305() {
    super(0);
  }

  private long mA = 0; // Counts 2 * the number of 1s

  @Override
  public Z next() {
    while (true) {
      if (Z.ONE.equals(super.next())) {
        mA += 2;
      }
      if (Z.ONE.equals(super.next())) {
        mA += 2;
      }
      if (mA == mN + 1) {
        return Z.valueOf(mA);
      }
    }
  }
}
