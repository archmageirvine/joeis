package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077816 Wieferich numbers (1): n &gt; 1 such that 2^A000010(n) == 1 (mod n^2).
 * @author Sean A. Irvine
 */
public class A077816 extends Sequence1 {

  private long mN = 1092;

  @Override
  public Z next() {
    while (true) {
      if (Z.TWO.modPow(Functions.PHI.z(++mN), Z.valueOf(mN).square()).isOne()) {
        return Z.valueOf(mN);
      }
    }
  }
}

