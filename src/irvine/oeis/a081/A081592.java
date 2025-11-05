package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A081592 A self generating sequence: "there are n a(n)'s in the sequence". Start with 1,2 and use the rule : "a(n)=k implies there are n following k's (k is 1 or 2)".
 * @author Sean A. Irvine
 */
public class A081592 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(1, (byte) 1);
    mA.set(2, (byte) 2);
  }
  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    if (mA.get(++mN) == 0) {
      final byte v = mA.get(mM);
      for (long k = 0; k < mM; ++k) {
        mA.set(mN + k, v);
      }
      ++mM;
    }
    return Z.valueOf(mA.get(mN));
  }
}
