package irvine.oeis.a195;

import irvine.math.BinaryLambdaCounts;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A195691 Number of closed normal form lambda calculus terms of size n in the binary encoding.
 * @author Gregory Morse
 */
public class A195691 extends Sequence0 {

  private final BinaryLambdaCounts mCounts = new BinaryLambdaCounts(true);
  private int mN = -1;

  @Override
  public Z next() {
    return mCounts.count(++mN, 0);
  }
}
