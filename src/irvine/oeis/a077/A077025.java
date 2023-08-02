package irvine.oeis.a077;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077025 a(n) = Sum_{k=1..n} floor(n/(k + 1/2))}.
 * @author Georg Fischer
 */
public class A077025 extends Sequence1 {

  private int mN;

  /** Construct the sequence. */
  public A077025() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> Z.valueOf(2L * mN / (2L * k + 1)));
  }
}
