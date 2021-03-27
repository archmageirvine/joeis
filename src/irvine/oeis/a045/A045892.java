package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045892 Solutions s to the equation 1=s*prime(n)+t*prime(n+1) with |s| as small as possible.
 * @author Sean A. Irvine
 */
public class A045892 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z q = mP;
    mP = super.next();
    final Z[] e = q.extendedGcd(mP);
    final Z t = e[1].add(mP);
    if (t.compareTo(e[1].negate()) < 0) {
      return t;
    } else {
      return e[1];
    }
  }
}
