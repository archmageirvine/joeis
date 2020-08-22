package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.Fibonacci;
import irvine.oeis.Sequence;

/**
 * A001224 If F(n) is the n-th Fibonacci number, then a(2n) = (F(2n+1) + F(n+2))/2 and a(2n+1) = (F(2n+2) + F(n+1))/2.
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
