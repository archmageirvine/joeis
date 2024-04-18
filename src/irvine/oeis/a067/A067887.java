package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A067887 Composite numbers k such that phi(k+1) &lt; phi(k).
 * @author Sean A. Irvine
 */
public class A067887 extends A002808 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (Functions.PHI.z(t.add(1)).compareTo(Functions.PHI.z(t)) < 0) {
        return t;
      }
    }
  }
}
