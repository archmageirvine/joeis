package irvine.oeis.a008;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008966 1 if n is squarefree, else 0.
 * @author Sean A. Irvine
 */
public class A008966 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return LongUtils.isSquareFree(++mN) ? Z.ONE : Z.ZERO;
  }
}

