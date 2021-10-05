package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.a014.A014011;

/**
 * A051741 Associated with a chi-inequality greedy algorithm.
 * @author Sean A. Irvine
 */
public class A051741 extends A014011 {

  private Z mA = super.next();
  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    final Z t = mA;
    mA = super.next();
    return mA.multiply(mN + 1).subtract(t.multiply(mN));
  }
}

