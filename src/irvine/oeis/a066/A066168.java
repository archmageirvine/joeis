package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A066168 a(n) = least k such that phi(k) &gt; sigma(n).
 * @author Sean A. Irvine
 */
public class A066168 extends A000203 {

  @Override
  public Z next() {
    final Z sigma = super.next();
    long k = 1;
    while (true) {
      k += 2;
      if (Functions.PHI.z(k).compareTo(sigma) > 0) {
        return Z.valueOf(k);
      }
    }
  }
}
