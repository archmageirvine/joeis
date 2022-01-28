package irvine.oeis.a077;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A077024 Sum{Floor(n/k + 1/2): k=1,2,...,n}.
 * @author Georg Fischer
 */
public class A077024 implements Sequence {

  private int mN;

  /** Construct the sequence. */
  public A077024() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sum(1, mN, k -> Z.valueOf((2 * mN + k) / (2 * k)));
  }
}
