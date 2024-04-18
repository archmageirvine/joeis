package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A067794 Nonprime numbers k such that phi(k) &gt; 3*k/4.
 * @author Sean A. Irvine
 */
public class A067794 extends A018252 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Functions.PHI.z(t).multiply(4).compareTo(t.multiply(3)) > 0) {
        return t;
      }
    }
  }
}
