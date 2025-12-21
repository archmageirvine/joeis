package irvine.oeis.a390;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A390509 Indices k such that (number of 0's) = (number of 1's) in the NA-run 01-word indexed by a(k) in A390508(k).
 * @author Sean A. Irvine
 */
public class A390509 extends Sequence1 {

  private long mN = 0;
  private final Bumper mBumper = BumperFactory.range(0, 1);
  private int[] mA = {};

  StringBuilder nextNa() {
    if (!mBumper.bump(mA)) {
      mA = new int[mA.length + 1];
    }
    final StringBuilder sb = new StringBuilder();
    int c = 1;
    for (int k = 1; k < mA.length; ++k) {
      if (mA[k] != mA[k - 1]) {
        sb.append(mA[k - 1]).append(Integer.toBinaryString(c));
        c = 1;
      } else {
        ++c;
      }
    }
    sb.append(mA[mA.length - 1]).append(Integer.toBinaryString(c));
    return sb;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final StringBuilder s = nextNa();
      int c = 0;
      for (int k = 0; k < s.length(); ++k) {
        c += s.charAt(k) == '0' ? 1 : -1;
      }
      if (c == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
