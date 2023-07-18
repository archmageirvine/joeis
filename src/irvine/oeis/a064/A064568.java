package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005132;

/**
 * A064552.
 * @author Sean A. Irvine
 */
public class A064568 extends Sequence1 {

  private final Sequence mA = new A005132();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mA.next().mod(++mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

