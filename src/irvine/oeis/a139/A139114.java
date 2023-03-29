package irvine.oeis.a139;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A139114 Concatenation of n-th Fibonacci number and n.
 * @author Georg Fischer
 */
public class A139114 extends Sequence1 {

  private long mN = 0;
  private final A000045 mSeq = new A000045();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    ++mN;
    return new Z(mSeq.next().toString() + String.valueOf(mN));
  }
}
