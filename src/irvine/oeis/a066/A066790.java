package irvine.oeis.a066;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066790 a(n) = least natural number k such that the distance between (n, sigma(n)) and (n+k, sigma(n+k)) is an integer (i.e., k^2 + (sigma(n+k) - sigma(n))^2 is a square), if such k exists; 0 otherwise.
 * @author Sean A. Irvine
 */
public class A066790 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z phi = Jaguar.factor(++mN).sigma();
    long k = 0;
    while (true) {
      if (Jaguar.factor(mN + ++k).sigma().subtract(phi).square().add(k * k).isSquare()) {
        return Z.valueOf(k);
      }
    }
  }
}

