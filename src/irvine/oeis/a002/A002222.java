package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a213.A213086;

/**
 * A002222.
 * @author Sean A. Irvine
 */
public class A002222 extends A213086 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, 5));
  }
}
