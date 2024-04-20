package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a020.A020639;

/**
 * A080864 Numbers n such that spf(n)+2 = spf(n-2), where spf=A020639 (smallest prime factor).
 * @author Georg Fischer
 */
public class A080864 extends A020639 {

  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.LPF.z(mN).add(2).equals(Functions.LPF.z(mN - 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
