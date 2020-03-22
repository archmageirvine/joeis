package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030087 Primes such that digits of p do not appear in <code>p^3</code>.
 * @author Sean A. Irvine
 */
public class A030087 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A030086.isOk(p, p.pow(3))) {
        return p;
      }
    }
  }
}
