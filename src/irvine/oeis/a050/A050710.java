package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.util.array.DynamicLongArray;

/**
 * A050710 Smallest composite that when added to sum of prime factors reaches a prime after n iterations.
 * @author Sean A. Irvine
 */
public class A050710 extends A050703 {

  private final DynamicLongArray mA = new DynamicLongArray();
  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      final Z n = Z.valueOf(++mM);
      if (!n.isProbablePrime()) {
        Z t = n;
        int cnt = 0;
        while (true) {
          t = f(t);
          ++cnt;
          if (t.isProbablePrime()) {
            if (mA.get(cnt) == 0) {
              mA.set(cnt, mM);
            }
            break;
          }
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
