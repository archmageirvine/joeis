package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.LongDynamicByteArray;

/**
 * A003589 a(n) has the property that the sequence b(n) = number of 2's between successive 3's is the same as the original sequence.
 * @author Sean A. Irvine
 */
public class A003589 extends Sequence0 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0, (byte) 2);
    mA.set(1, (byte) 2);
    mA.set(2, (byte) 3);
  }
  private long mN = -1;

  @Override
  public Z next() {
    final int b = mA.get(++mN);
    for (int k = 0; k < b; ++k) {
      mA.set(mA.length(), (byte) 2);
    }
    mA.set(mA.length(), (byte) 3);
    return Z.valueOf(b);
  }
}
