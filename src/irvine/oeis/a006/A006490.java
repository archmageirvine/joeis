package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006490 a(1) = 1, a(2) = 0; for n &gt; 2, a(n) = n*Fibonacci(n-2) (with the convention Fibonacci(0)=0, Fibonacci(1)=1).
 * @author Sean A. Irvine
 */
public class A006490 extends A000045 {

  {
    setOffset(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : super.next().multiply(mN);
  }
}

