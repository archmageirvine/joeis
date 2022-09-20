package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a207.A207975;

/**
 * A059393.
 * @author Sean A. Irvine
 */
public class A059393 extends A207975 {

  @Override
  public Z next() {
    step();
    return Z.valueOf(mBest);
  }
}
