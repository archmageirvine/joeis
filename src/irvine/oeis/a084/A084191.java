package irvine.oeis.a084;

import irvine.math.z.Z;

/**
 * A084191 a(n) = A084190(A084190(n)).
 * @author Sean A. Irvine
 */
public class A084191 extends A084190 {

  private long mN = 0;

  @Override
  public Z next() {
    return t(t(Z.valueOf(++mN)));
  }
}
