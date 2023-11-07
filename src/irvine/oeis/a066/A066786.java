package irvine.oeis.a066;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066786 a(n) is the least k such that the distance between (n, phi(n)) and (n+k, phi(n+k)) is an integer (i.e., k^2 + (phi(n+k) - phi(n))^2 is a square), or 0 if none exists.
 * @author Sean A. Irvine
 */
public class A066786 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z phi = Euler.phi(++mN);
    long k = 0;
    while (true) {
      if (Euler.phi(mN + ++k).subtract(phi).square().add(k * k).isSquare()) {
        return Z.valueOf(k);
      }
    }
  }
}

