package irvine.oeis.a077;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077026 a(n) = Sum_{k=1..n} floor(n/k + 1)-floor(n/k + 1/2).
 * @author Georg Fischer
 */
public class A077026 extends Sequence1 {

  private int mN;

  /** Construct the sequence. */
  public A077026() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> Z.valueOf(mN / k + 1 - (2 * mN + k) / (2 * k)));
  }
}
