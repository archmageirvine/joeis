package irvine.oeis.a334;
// manually sumdiv3/sumdiv at 2023-04-11 14:46

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A334019 Sum of unitary divisors of n that are smaller than sqrt(n).
 * @author Georg Fischer
 */
public class A334019 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A334019() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> (Z.valueOf(d).gcd(Z.valueOf(mN / d)).compareTo(Z.ONE) == 0 && d * d < mN ? Z.valueOf(d) : Z.ZERO));
  }
}
