package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a002.A002387;

/**
 * A004080.
 * @author Sean A. Irvine
 */
public class A004080 extends A002387 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(++mN <= 2 ? 1 : 0);
  }

}
