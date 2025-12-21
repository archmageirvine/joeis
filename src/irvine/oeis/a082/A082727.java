package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082727 a(0)=1, a(n)=abs(n-2*a(n-1)).
 * @author Sean A. Irvine
 */
public class A082727 extends Sequence0 {

  private long mN = -1;
  private long mA = 1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = Math.abs(mN - 2 * mA);
    }
    return Z.valueOf(mA);
  }
}
