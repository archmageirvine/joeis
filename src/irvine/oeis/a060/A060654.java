package irvine.oeis.a060;

import irvine.math.z.Z;

/**
 * A060654 a(n) = gcd(n, A060766(n)).
 * @author Sean A. Irvine
 */
public class A060654 extends A060766 {

  @Override
  public Z next() {
    return super.next().gcd(Z.valueOf(mN));
  }
}
