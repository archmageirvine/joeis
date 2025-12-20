package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A082691 a(1)=1, a(2)=2, then if the first 3*2^k-1 terms are a(1), a(2), ..., a(3*2^k - 1), the first 3*2^(k+1)-1 terms are a(1), a(2), ..., a(3*2^k - 1), a(1), a(2), ..., a(3*2^k - 1), a(3*2^k-1) + 1.
 * @author Sean A. Irvine
 */
public class A082691 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0, (byte) 1);
    mA.set(1, (byte) 2);
  }
  private long mN = -1;
  private long mM = 2;

  @Override
  public Z next() {
    if (++mN == mM) {
      for (long k = 0; k < mN; ++k) {
        mA.set(mM++, mA.get(k));
      }
      mA.set(mM++, (byte) (mA.get(mN - 1) + 1));
    }
    return Z.valueOf(mA.get(mN));
  }
}
