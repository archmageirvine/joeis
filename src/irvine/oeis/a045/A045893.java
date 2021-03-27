package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045893 Solutions t to the equation s*prime(n) + t*prime(n+1) = 1 with |s| as small as possible.
 * @author Sean A. Irvine
 */
public class A045893 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z q = mP;
    mP = super.next();
    final Z[] e = q.extendedGcd(mP);
    if (e[1].add(mP).compareTo(e[1].negate()) < 0) {
      return e[2].subtract(q);
    } else {
      return e[2];
    }
  }
}
