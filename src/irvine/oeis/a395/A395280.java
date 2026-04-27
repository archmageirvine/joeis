package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395280 a(n) = Product_{k=1..n-2} (n*k + n - 1)! / (n*k + 1)!.
 * @author Sean A. Irvine
 */
public class A395280 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.product(1, ++mN - 2, k -> Functions.FACTORIAL.z(mN * k + mN - 1).divide(Functions.FACTORIAL.z(mN * k + 1)));
  }
}

