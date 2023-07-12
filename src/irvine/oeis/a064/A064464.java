package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a060.A060692;

/**
 * A064464 Binary order (cf. A029837) of the number of parts if 3^n is partitioned into parts of size 2^n as far as possible and into parts of size 1^n (cf. A060692).
 * @author Sean A. Irvine
 */
public class A064464 extends A060692 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      super.next();
      return Z.ONE;
    }
    return Z.valueOf(super.next().bitLength());
  }
}
