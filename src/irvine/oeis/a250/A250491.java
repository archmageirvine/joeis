package irvine.oeis.a250;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A250491 (n^5)-th Fibonacci number.
 * @author Georg Fischer
 */
public class A250491 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Fibonacci.fibonacci((long) mN * mN * mN * mN * mN);
  }
}
