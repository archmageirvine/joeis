package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070035 Exponents of 2 when A068496(n) is also a power of 2.
 * @author Sean A. Irvine
 */
public class A070035 extends Sequence1 {

  private Z mA = Z.ONE;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply2();
      Z f = Z.ONE;
      for (long k = 2; k <= mN; ++k) {
        f = f.modMultiply(k, mA);
      }
      if (f.bitCount() == 1) {
        return Z.valueOf(f.makeOdd().auxiliary());
      }
    }
  }
}
