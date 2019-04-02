package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.io.Serializable;

/**
 * A004396 One even number followed by two odd numbers.
 * @author Sean A. Irvine
 */
public class A004396 implements Sequence, Serializable {

  private Z mN = Z.NEG_ONE;
  private int mCount = 0;

  @Override
  public Z next() {
    if (mCount == 0) {
      mN = mN.add(1);
      mCount = mN.isEven() ? 1 : 2;
    }
    --mCount;
    return mN;
  }
}
