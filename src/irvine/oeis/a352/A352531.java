package irvine.oeis.a352;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.SequenceWithOffset;

/**
 * A352531 Numbers with multiplicative persistence value 10.
 * @author Georg Fischer
 */
public class A352531 implements SequenceWithOffset {

  private Z mN = Z.valueOf(3778888998L);

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.multiplicativePersistence(mN) == 10) {
        return mN;
      }
    }
  }
}
