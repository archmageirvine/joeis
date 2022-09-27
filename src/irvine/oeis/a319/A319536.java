package irvine.oeis.a319;
// manually cordrectab/cordrec at 2022-07-15

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000165;
import irvine.oeis.a271.A271212;

/**
 * A319536 Number of signed permutations of length n where numbers occur in consecutive order.
 * <code>a(n) = A000165(n) - A271212(n).</code>
 * @author Georg Fischer
 */
public class A319536 extends A271212 {

  private final Sequence mSeq = new A000165();

  /** Construct the sequence */
  public A319536() {
    super.next();
    mSeq.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(super.next());
  }
}
