package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066767 a(n) = Sum_{k=1..n} sigma(k)*2^(n-k) where sigma(k) = A000203(k) is the sum of divisors of k.
 * @author Sean A. Irvine
 */
public class A066767 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> Functions.SIGMA.z(k).shiftLeft(mN - k));
  }
}

