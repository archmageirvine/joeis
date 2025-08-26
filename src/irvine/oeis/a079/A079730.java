package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicByteArray;

/**
 * A079730 Kolakoski variation using (1,2,3,4) starting with 1,2.
 * @author Sean A. Irvine
 */
public class A079730 extends Sequence1 {

  private final LongDynamicByteArray mA = new LongDynamicByteArray();
  {
    mA.set(0, (byte) 1);
    mA.set(1, (byte) 2);
    mA.set(2, (byte) 2);
  }
  private long mL = 3; // Length of computed region of mA
  private long mN = -1;
  private long mM = 2; // Position of last run length expanded in mA

  @Override
  public Z next() {
    if (++mN >= mL) {
      final byte v = (byte) (1 + (mM & 3));
      for (int i = 1; i <= mA.get(mM); ++i) {
        mA.set(mL++, v);
      }
      ++mM;
    }
    return Z.valueOf(mA.get(mN));
  }
}
