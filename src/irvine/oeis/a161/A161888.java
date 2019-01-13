package irvine.oeis.a161;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A161888.
 * @author Sean A. Irvine
 */
public class A161888 implements Sequence {

  private Z mSum = null;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    if (mSum == null) {
      mSum = Z.TWO;
      return Z.TWO;
    } else {
      long q = 1;
      final Z n = Z.valueOf(mN);
      while (true) {
        if (mN % ++q != 0 && Z.ONE.equals(mSum.add(q).gcd(n))) {
          mSum = mSum.add(q);
          return Z.valueOf(q);
        }
      }
    }
  }
}

