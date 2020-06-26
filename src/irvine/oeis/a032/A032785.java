package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032785.
 * @author Sean A. Irvine
 */
public class A032785 implements Sequence {

  private long mN = -1;

  protected long t() {
    return 13;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      Z a = Z.ONE;
      for (long k = 0; k <= t(); ++k) {
        a = a.multiply(mN + k);
      }
      if (a.mod((t() + 1) * mN + t() * (t() + 1) / 2) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

