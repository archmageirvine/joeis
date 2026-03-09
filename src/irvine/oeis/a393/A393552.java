package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A393552 allocated for Rhys Feltman.
 * @author Sean A. Irvine
 */
public class A393552 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> Functions.PHI.z(d).shiftLeft((2 * mN - 3 - (d & 1)) * (mN / d))).divide(mN)
      .add(Z.ONE.shiftLeft((mN * (2 * mN - 3) - 3) / 2)).add(Z.ONE.shiftLeft((mN * (2 * mN - 3) - 2) / 2)).divide2();
  }
}

