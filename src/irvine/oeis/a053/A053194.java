package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a051.A051953;
import irvine.util.array.LongDynamicLongArray;

/**
 * A053192.
 * @author Sean A. Irvine
 */
public class A053194 extends A051953 {

  private final LongDynamicLongArray mA = new LongDynamicLongArray();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    ++mN;
    while (mA.get(mN) == 0) {
      final Z t = super.next();
      ++mM;
      if (t.isOdd()) {
        final long s = t.longValueExact() / 2;
        if (mA.get(s) == 0) {
          mA.set(s, mM);
        }
      }
    }
    return Z.valueOf(mA.get(mN));
  }
}
