package irvine.oeis.a004;

import java.io.Serializable;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004396 One even number followed by two odd numbers.
 * @author Sean A. Irvine
 */
public class A004396 extends Sequence0 implements Serializable {

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
