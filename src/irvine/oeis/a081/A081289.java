package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A081289 a(0) = 0, a(n) = A081293(A081288(n)-1).
 * @author Sean A. Irvine
 */
public class A081289 extends Sequence0 {

  private final Sequence mS = new A081288();
  private final Sequence mT = new A081293();
  private Z mA = mS.next();
  private Z mB = mT.next();
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    final Z r = mS.next();
    if (r.compareTo(mA) > 0) {
      mA = r;
      mB = mT.next();
    }
    return mB;
  }
}

