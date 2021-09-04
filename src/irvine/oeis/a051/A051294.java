package irvine.oeis.a051;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051233.
 * @author Sean A. Irvine
 */
public class A051294 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Fibonacci.fibonacci(++mN * mN).divide(Fibonacci.fibonacci(mN));
  }
}
