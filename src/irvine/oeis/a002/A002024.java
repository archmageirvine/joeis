package irvine.oeis.a002;

import java.io.Serializable;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002024 k appears k times; a(n) = floor(sqrt(2n) + 1/2).
 * @author Sean A. Irvine
 */
public class A002024 extends Sequence1 implements Serializable {

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
