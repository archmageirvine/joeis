package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a007.A007474;

/**
 * A003437.
 * @author Sean A. Irvine
 */
public class A003437 extends A007474 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply2().add(get(mN, 2L)).subtract(get(mN - 1, 2L)).add(get(mN - 2, 2L)).divide(4);
  }
}

