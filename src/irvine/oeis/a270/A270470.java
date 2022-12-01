package irvine.oeis.a270;

import irvine.math.z.Z;
import irvine.oeis.a001.A001654;

/**
 * A270470 Integers n such that A001654(n) is divisible by n*(n+1)/2.
 * @author Georg Fischer
 */
public class A270470 extends A001654 {

  private int mN = 0;

  {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().mod(Z.valueOf(mN * (mN + 1) / 2)).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
