package irvine.oeis.a114;

import irvine.math.BinaryLambdaCounts;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A114852 Number of closed lambda calculus terms of size n in the binary encoding.
 * @author Gregory Morse
 */
public class A114852 extends Sequence0 {

  private final BinaryLambdaCounts mCounts = new BinaryLambdaCounts(false);
  private int mN = -1;

  @Override
  public Z next() {
    return mCounts.count(++mN, 0);
  }
}
