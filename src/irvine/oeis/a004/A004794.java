package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A004794.
 * @author Sean A. Irvine
 */
public class A004794 implements Sequence {

  private static final int[] S = {2, 5, 7, 7, 10, 11};
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci(12 * (mN / 6) + S[mN % 6]).add(1).divide2();
  }
}
