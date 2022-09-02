package irvine.oeis.a049;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A049518 Starting index of a string of exactly 2 consecutive equal digits in the decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A049518 extends A000796 {

  private Z mA = super.next();

  /** Construct the sequence. */
  public A049518() {
    super(0);
  }

  protected int numberOfOccurrences() {
    return 2;
  }

  @Override
  public Z next() {
    while (true) {
      long cnt = 0;
      final Z s = mA;
      do {
        ++cnt;
        mA = super.next();
      } while (s.equals(mA));
      if (cnt == numberOfOccurrences()) {
        return Z.valueOf(mN - numberOfOccurrences());
      }
    }
  }
}

