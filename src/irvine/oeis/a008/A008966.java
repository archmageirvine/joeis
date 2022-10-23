package irvine.oeis.a008;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A008966 a(n) = 1 if n is squarefree, otherwise 0.
 * @author Sean A. Irvine
 */
public class A008966 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return LongUtils.isSquareFree(++mN) ? Z.ONE : Z.ZERO;
  }
}

