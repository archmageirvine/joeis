package irvine.oeis.a066;

import irvine.math.function.Functions;
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
    final Z phi = Functions.PHI.z(++mN);
    long k = 0;
    while (true) {
      final long n = mN + ++k;
      if (Functions.PHI.z(n).subtract(phi).square().add(k * k).isSquare()) {
        return Z.valueOf(k);
      }
    }
  }
}

