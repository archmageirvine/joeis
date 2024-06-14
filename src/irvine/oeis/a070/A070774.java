package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A070774 Odd numbers n such that p(2m)-2p(m)=n has no solution (p(m) = m-th prime).
 * @author Sean A. Irvine
 */
public class A070774 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A070774() {
    super(1, new A070773(), ZERO);
  }

  @Override
  public Z next() {
    return super.next().multiply2().subtract(1);
  }
}
