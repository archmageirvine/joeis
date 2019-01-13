package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.LongDynamicByteArray;

/**
 * A001285.
 * @author Sean A. Irvine
 */
public class A001285 implements Sequence {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      mA.set(0, (byte) 1);
      return Z.ONE;
    }
    final byte b = (mN & 1) == 0 ? mA.get(mN >>> 1) : (byte) (3 - mA.get(mN >>> 1));
    mA.set(mN, b);
    return Z.valueOf(b);
  }

}
