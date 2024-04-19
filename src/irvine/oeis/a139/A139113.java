package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A139113 Concatenation of n and n-th Fibonacci number.
 * @author Georg Fischer
 */
public class A139113 extends Sequence1 {

  private long mN = 0;
  private final A000045 mSeq = new A000045();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return new Z(mN + mSeq.next().toString());
  }
}
