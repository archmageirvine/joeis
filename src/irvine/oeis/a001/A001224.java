package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A001224.
 * @author Sean A. Irvine
 */
public class A001224 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 0) {
      return Fibonacci.fibonacci(mN + 1).add(Fibonacci.fibonacci(mN / 2 + 2)).divide(2);
    } else {
      return Fibonacci.fibonacci(mN + 1).add(Fibonacci.fibonacci((mN + 1) / 2)).divide(2);
    }
  }
}
