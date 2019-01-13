package irvine.oeis.a006;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006985.
 * @author Sean A. Irvine
 */
public class A006985 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Fibonacci.fibonacci(mA.add(2).intValueExact());
    return mA;
  }
}
