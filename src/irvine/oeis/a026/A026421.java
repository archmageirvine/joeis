package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026421 <code>a(n) =</code> least positive integer <code>&gt; a(n-1)</code> and not <code>a(i)*a(j)</code> for <code>1&lt;=i&lt;j&lt;=n</code>.
 * @author Sean A. Irvine
 */
public class A026421 extends A026416 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.ONE.equals(t) && !Z.TWO.equals(t)) {
        return t;
      } else {
        remove(t);
        mForbidden.remove(t);
      }
    }
  }
}
