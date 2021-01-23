package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026417 a(n) = least positive integer &gt; a(n-1) and not a(i)*a(j) for 1&lt;=i&lt;j&lt;=n.
 * @author Sean A. Irvine
 */
public class A026417 extends A026416 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.TWO.equals(t)) {
        return t;
      } else {
        // Evilness to handle the 2 we don't want here
        remove(t);
        mForbidden.remove(t);
      }
    }
  }
}
