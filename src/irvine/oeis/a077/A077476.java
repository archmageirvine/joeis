package irvine.oeis.a077;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077476 Numbers n such that the digital binary sum of n equals core(n), the squarefree part of n.
 * @author Sean A. Irvine
 */
public class A077476 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.CORE.l(++mN) == Long.bitCount(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
