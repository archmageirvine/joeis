package irvine.oeis.a224;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A224848.
 * @author Sean A. Irvine
 */
public class A224848 extends Sequence1 {

  private final StringBuilder mA = new StringBuilder();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      mA.insert(0, ++mN * mN);
      if (new Z(mA).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
