package irvine.oeis.a006;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A006985 Fibonacci tower: a(n) = F(a(n-1)+2) (there is no room for next term).
 * @author Sean A. Irvine
 */
public class A006985 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : Functions.FIBONACCI.z(mA.add(2));
    return mA;
  }
}
