package irvine.oeis.a005;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005845 Bruckman-Lucas pseudoprimes: k | (L_k - 1), where k is composite and L_k = Lucas numbers A000032.
 * @author Sean A. Irvine
 */
public class A005845 extends Sequence1 {

  private Z mN = Z.valueOf(704);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z lucas = Functions.LUCAS.z(mN);
      if (!mN.isProbablePrime(30) && Z.ONE.equals(lucas.mod(mN))) {
        return mN;
      }
    }
  }
}
