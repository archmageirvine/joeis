package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026419 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)*a(j)</code> for <code>1&lt;=i&lt;j&lt;=n</code>.
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
        remove(t);
        mForbidden.remove(t);
      }
    }
  }
}
