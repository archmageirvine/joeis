package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a020.A020639;

/**
 * A080864 Numbers k such that lpf(k)+2 = lpf(k-2), where lpf=A020639 (least prime factor).
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
