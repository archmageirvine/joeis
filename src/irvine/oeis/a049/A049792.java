package irvine.oeis.a049;

import irvine.math.z.Z;

/**
 * A049792 a(n) = Sum_{k=1..n} floor(n/floor(n/k)).
 * @author Sean A. Irvine
 */
public class A049792 extends A049790 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(t(++mN, mN));
  }
}
