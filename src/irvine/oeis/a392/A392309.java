package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A392309 First row in which A392308(n) appears in the irregular triangle A392306; i.e., first k for which A392308(n) * sigma_k(A392308(n)) == 2 (mod phi(A392308(n))).
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
