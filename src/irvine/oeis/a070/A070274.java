package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070274 Numbers n such that sum of digits of n equals the squarefree part of n.
 * @author Sean A. Irvine
 */
public class A070274 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.DIGIT_SUM.l(++mN) == Functions.CORE.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
