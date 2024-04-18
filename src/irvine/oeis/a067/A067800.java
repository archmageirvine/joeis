package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A067800 Nonprime n such that phi(n) &gt; n/2.
 * @author Sean A. Irvine
 */
public class A067800 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Functions.PHI.z(t).multiply2().compareTo(t) > 0) {
        return t;
      }
    }
  }
}
