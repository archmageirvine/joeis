package irvine.oeis.a394;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A394974 allocated for Karan Sharma.
 * @author Sean A. Irvine
 */
public class A394974 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN - 2, k -> Z.valueOf((mN - 1) / (mN * k / Functions.GCD.l(k + 1, mN) / Functions.GCD.l(k, mN - 1))));
  }
}

