package irvine.oeis.a006;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006985 Fibonacci tower: <code>a(n) = F(a(n-1)+2)</code> (there is no room for next term).
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
