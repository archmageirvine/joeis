package irvine.oeis.a007;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A007370 Numbers k such that sigma(x) = k has a unique solution.
 * @author Sean A. Irvine
 */
public class A007370 implements Sequence {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  private long mN = 0;
  private long mS = 0;

  protected int select() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      while (mN >= mS || mN >= mA.length()) {
        final long sigma = Jaguar.factor(++mS).sigma().longValueExact();
        final byte b = mA.get(sigma);
        if (b <= select()) {
          mA.set(sigma, (byte) (b + 1));
        }
      }
      if (mA.get(mN) == select()) {
        return Z.valueOf(mN);
      }
    }
  }
}
