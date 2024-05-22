package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054711 Multiplicative order of 11 mod n, where gcd(n, 11) = 1.
 * @author Georg Fischer
 */
public class A054711 extends Sequence1 {

  private long mN = 0;
  private final Z mBase = Z.valueOf(11);

  @Override
  public Z next() {
    ++mN;
    if (mN == 1) {
      return Z.ONE;
    }
    if (mN % 11 == 0) {
      ++mN;
    }
    return Functions.ORDER.z(mN, mBase);
  }
}
