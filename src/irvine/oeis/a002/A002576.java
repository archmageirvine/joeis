package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a262.A262554;

/**
 * A002576.
 * @author Sean A. Irvine
 */
public class A002576 extends A262554 {

  private int mN = 2;

  @Override
  public Z next() {
    return get(++mN, 2);
  }
}

