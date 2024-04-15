package irvine.oeis.a184;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A184389 a(n) = Sum_{k=1..tau(n)} k, where tau is the number of divisors of n (A000005).
 * @author Georg Fischer
 */
public class A184389 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, Functions.SIGMA0.z(mN).intValue(), k -> Z.valueOf(k));
  }
}
