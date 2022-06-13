package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057536 Minimal number of coins needed to pay n Euro-cents using the Euro currency.
 * @author Sean A. Irvine
 */
public class A057536 implements Sequence {

  private static final long[] COINS = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long cnt = 0;
    for (long coin : COINS) {
      cnt += m / coin;
      m %= coin;
    }
    return Z.valueOf(cnt);
  }
}
