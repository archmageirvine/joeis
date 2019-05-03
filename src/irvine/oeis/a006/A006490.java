package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A006490 <code>a(1) = 1, a(2) = 0</code>; for <code>n &gt; 2, a(n) = n*Fibonacci(n-2)</code> (with the convention <code>Fibonacci(0)=0, Fibonacci(1)=1)</code>.
 * @author Sean A. Irvine
 */
public class A006490 extends A000045 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.ONE : super.next().multiply(mN);
  }
}

