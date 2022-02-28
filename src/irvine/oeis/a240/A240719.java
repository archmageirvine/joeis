package irvine.oeis.a240;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A240719 Numbers k such that 2^k == 1 (mod (k+1)^2).
 * @author Georg Fischer
 */
public class A240719 implements Sequence {

  private int mK = 0;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (Z.ONE.shiftLeft(mK).mod(Z.valueOf(mK + 1).square()).equals(Z.ONE)) {
        return Z.valueOf(mK);
      }
    }
  }
}
