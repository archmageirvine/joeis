package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A086675 Number of n X n (0,1)-matrices modulo cyclic permutations of the rows.
 * @author Sean A. Irvine
 */
public class A086675 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sumdiv(mN, d -> Functions.PHI.z(d).shiftLeft(mN * (mN / d))).divide(mN);
  }
}

