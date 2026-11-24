package irvine.oeis.a195;

import irvine.math.BinaryLambdaCounts;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A195691 The number of closed normal form lambda calculus terms of size n, where size(lambda x.M)=2+size(M), size(M N)=2+size(M)+size(N), and size(V)=1+i for a variable V bound by the i-th enclosing lambda (corresponding to a binary encoding).
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
