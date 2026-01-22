package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A392309 allocated for Scott Duke Kominers.
 * @author Sean A. Irvine
 */
public class A392309 extends A392308 {

  @Override
  public Z next() {
    final Z t = super.next();
    if (t.compareTo(Z.SIX) <= 0) {
      return Z.ZERO;
    }
    final Z phi = Functions.PHI.z(t);
    final Z r = Z.TWO.mod(phi);
    long k = -1;
    while (true) {
      k += 2;
      if (Functions.SIGMA.z(k, t).modMultiply(t, phi).equals(r)) {
        return Z.valueOf(k);
      }
    }
  }
}
