package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014661 Numbers that do not divide 2^k <code>+ 1</code> for any k&gt;0.
 * @author Sean A. Irvine
 */
public class A014661 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if ((++mN & 1) == 0) {
        return Z.valueOf(mN); // all even numbers are included
      }
      long k2 = 2;
      boolean ok = true;
      for (long j = 1; j < mN; ++j) {
        if (k2 == mN - 1) {
          ok = false;
          break;
        }
        k2 <<= 1;
        k2 %= mN;
      }
      if (ok) {
        return Z.valueOf(mN);
      }
    }
  }
}

