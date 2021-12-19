package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A053231 First differences between n for which sigma(n) &lt; sigma(n+1), which are not 2.
 * @author Sean A. Irvine
 */
public class A053231 extends A053230 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (!Z.TWO.equals(t)) {
        return t;
      }
    }
  }
}
