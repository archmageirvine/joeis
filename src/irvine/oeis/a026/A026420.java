package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026420 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j) for 1&lt;=i&lt;j&lt;=n.
 * @author Sean A. Irvine
 */
public class A026420 extends A026416 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ONE.equals(t) && !Z.THREE.equals(t)) {
        return t;
      } else {
        remove(t);
        mForbidden.remove(t);
        mForbidden.remove(Z.SIX);
      }
    }
  }
}
