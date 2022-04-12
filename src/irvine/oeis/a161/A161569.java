package irvine.oeis.a161;
// manually partsumm/partsum at 2022-04-12 19:21

import irvine.math.z.Z;
import irvine.oeis.a018.A018252;

/**
 * A161569 Sum of first n nonprimes minus their indices.
 * @author Georg Fischer
 */
public class A161569 extends A018252 {

  private Z mSum;
  private int mN;

  /** Construct the sequence. */
  public A161569() {
    mSum = Z.ZERO;
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    mSum = mSum.add(super.next().subtract(mN));
    return mSum;
  }
}
