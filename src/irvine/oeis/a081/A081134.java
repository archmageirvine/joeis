package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a006.A006166;

/**
 * A081134 Distance to nearest power of 3.
 * @author Georg Fischer
 */
public class A081134 extends Sequence1 {

  private final A006166 mSeq = new A006166();
  private int mN = 0;

  /** Construct the sequence. */
  public A081134() {
    mSeq.next();
  }

  @Override
  public Z next() {
    // a(n) = n - A006166(n)
    ++mN;
    return Z.valueOf(mN).subtract(mSeq.next());
  }
}
