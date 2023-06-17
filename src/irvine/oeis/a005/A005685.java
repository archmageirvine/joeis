package irvine.oeis.a005;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A005685 Number of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005685 extends AbstractSequence {

  /** Construct the sequence. */
  public A005685() {
    super(4);
  }

  private static final long[] C = {0, 1, 1, 0, -1, -1};
  private int mN = 3;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci((mN + 1) / 2).multiply2().add(Fibonacci.fibonacci(mN)).add(C[mN % 6]).divide(4);
  }
}

