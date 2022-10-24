package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026419 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j) for 1&lt;=i&lt;j&lt;=n.
 * @author Sean A. Irvine
 */
public class A026419 extends A026416 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.TWO.equals(t) && !Z.THREE.equals(t)) {
        return t;
      } else {
        // Evilness to handle the 2 and 3 we don't want here
        toList().remove(t);
        mForbidden.remove(t);
      }
    }
  }
}
