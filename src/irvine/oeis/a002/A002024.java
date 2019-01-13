package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import java.io.Serializable;

/**
 * A002024.
 * @author Sean A. Irvine
 */
public class A002024 implements Sequence, Serializable {

  private Z mN = Z.ZERO;
  private long mToGo = 0;

  @Override
  public Z next() {
    if (--mToGo <= 0) {
      mN = mN.add(1);
      mToGo = mN.longValue();
    }
    return mN;
  }
}
