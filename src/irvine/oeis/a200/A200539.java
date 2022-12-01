package irvine.oeis.a200;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;
import irvine.oeis.a001.A001006;

/**
 * A200539 Product of Fibonacci and Motzkin numbers: a(n) = A000045(n+1)*A001006(n).
 * @author Georg Fischer
 */
public class A200539 extends A000045 {

  private int mN = -1;
  private final Sequence mSeq = new A001006();

  {
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    return super.next().multiply(mSeq.next());
  }
}
