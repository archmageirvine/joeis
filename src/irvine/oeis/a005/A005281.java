package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002004;

/**
 * A005281 Davenport-Schinzel numbers.
 * @author Sean A. Irvine
 */
public class A005281 extends A002004 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(davenportSchinzel(6, ++mN));
  }
}
