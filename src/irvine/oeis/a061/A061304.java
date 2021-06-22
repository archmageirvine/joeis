package irvine.oeis.a061;
// manually 2021-06-22

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061304 Squarefree triangular numbers.
 * @author Georg Fischer
 */

public class A061304 implements Sequence {
  
  protected long mN = 0;
  
  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z result = Z.valueOf(mN).multiply(mN + 1).divide2();
      if (Cheetah.factor(result).maxExponent() <= 1) {
        return result;
      }
    }
  }
}
