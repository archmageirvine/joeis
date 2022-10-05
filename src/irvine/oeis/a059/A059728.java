package irvine.oeis.a059;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.a002.A002426;

/**
 * A059728 a(0)=3; thereafter, a(n) = A002426(n+1) + Fibonacci(n-1)*(Fibonacci(n-1) + 1).
 * @author Sean A. Irvine
 */
public class A059728 extends A002426 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    if (mN == 1) {
      return Z.THREE;
    }
    final Z f = Fibonacci.fibonacci((int) mN - 2);
    return t.add(f.multiply(f.add(1)));
  }
}

