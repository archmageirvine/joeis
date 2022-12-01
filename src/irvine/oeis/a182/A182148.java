package irvine.oeis.a182;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A182148 a(n) = Fibonacci(n-1)^n.
 * @author Georg Fischer
 */
public class A182148 extends A000045 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      return super.next();
    }
    return super.next().pow(mN);
  }
}
