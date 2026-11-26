package irvine.oeis.a336;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A336663 2-Carmichael numbers: composite numbers n such that A^{n*(n-1)*(n+1)} = I for every matrix A from the group GL(2,Z/nZ).
 * @author Gregory Morse
 */
public class A336663 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z n = Z.valueOf(++mN);
      if (!n.isProbablePrime()) {
        final Z bound = n.multiply(n.square().subtract(1));
        boolean ok = true;
        for (final Z p : Jaguar.factor(n).toZArray()) {
          if (!bound.mod(p.square().subtract(1)).isZero()) {
            ok = false;
            break;
          }
        }
        if (ok) {
          return n;
        }
      }
    }
  }
}
