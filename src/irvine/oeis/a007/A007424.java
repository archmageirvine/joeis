package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007424 a(n) = 1 if n is squarefree, otherwise 2.
 * @author Sean A. Irvine
 */
public class A007424 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return LongUtils.isSquareFree(++mN) ? Z.ONE : Z.TWO;
  }
}
