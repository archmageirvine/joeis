package irvine.oeis.a259;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a253.A253641;

/**
 * A259362 a(1) = 1, for n &gt; 1: a(n) is the number of ways to write n as a nontrivial perfect power.
 * @author Georg Fischer
 */
public class A259362 extends A253641 {

  private int mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = Jaguar.factor(super.next()).sigma0().subtract(1);
    return (mN == 1) ? Z.ONE : result;
  }
}
