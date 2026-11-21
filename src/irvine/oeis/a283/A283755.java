package irvine.oeis.a283;

import irvine.math.z.Z;
import irvine.oeis.a322.A322114;

/**
 * A283755 Irregular triangular array read by rows: T(n,k) = number of non-isomorphic unlabeled connected graphs with loops on n nodes and with k edges.
 * @author Gregory Morse
 */
public class A283755 extends A322114 {
  private int mN = 0;
  private int mK = 0;

  /** Construct the sequence. */
  public A283755() {
    setOffset(1);
  }

  @Override
  public Z next() {
    if (++mK > mN * (mN + 1) / 2) {
      ++mN;
      mK = mN - 1;
      prepare(mN, mN * (mN + 1) / 2);
    }
    return connected(mN, mK);
  }
}
