package irvine.oeis.a126;
// manually sumdiv3/sumdiv at 2023-04-11 10:07

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A126213 a(n) = sum of the d(k)'s, where 1&lt;=k&lt;=n and d(k) is equal to any divisor of n, where d(k) is the number of positive divisors of k.
 * @author Georg Fischer
 */
public class A126213 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A126213() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    // A126213(n) = sumdiv(n, d, d*sum(k=1, n, (numdiv(k)==d)));
    return Integers.SINGLETON.sumdiv(mN, d -> Integers.SINGLETON.sum(1, mN, k -> Functions.SIGMA0.z(k).equals(Z.valueOf(d)) ? Z.ONE : Z.ZERO).multiply(d));
  }
}
