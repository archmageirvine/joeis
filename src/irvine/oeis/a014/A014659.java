package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014659 Numbers n that are odd and do not divide 2^k <code>+ 1</code> for any k <code>&gt;= 1</code>.
 * @author Sean A. Irvine
 */
public class A014659 implements Sequence {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
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

