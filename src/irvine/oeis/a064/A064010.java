package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A064010 Numbers k such that sopf(k) = d(k) where d(k) = A001223(k) and sopf(k) = A008472(k).
 * @author Sean A. Irvine
 */
public class A064010 extends A001223 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(Jaguar.factor(++mN).sopf())) {
        return Z.valueOf(mN);
      }
    }
  }
}
