package irvine.oeis.a005;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005372 <code>a(n) = L(L(n+1)+1)</code>, where <code>L(n)</code> are Lucas numbers A000032.
 * @author Sean A. Irvine
 */
public class A005372 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Fibonacci.lucas(Fibonacci.lucas(++mN).intValueExact() + 1);
  }
}
