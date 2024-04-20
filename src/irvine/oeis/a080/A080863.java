package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080863 Numbers n such that spf(n)-2 = spf(n+2), where spf=A020639 (smallest prime factor).
 * @author Georg Fischer
 */
public class A080863 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Functions.LPF.z(mN).subtract(2).equals(Functions.LPF.z(mN + 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
