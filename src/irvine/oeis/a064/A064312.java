package irvine.oeis.a064;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000110;

/**
 * A064312 a(n) = B(n)*P(n), where B(n) are Bell numbers (A000110) and P(n) are numbers of arrangements of a set of n elements (A000522).
 * @author Sean A. Irvine
 */
public class A064312 extends A000110 {

  private int mN = -1;

  @Override
  public Z next() {
    return super.next().multiply(Integers.SINGLETON.sum(0, ++mN, k -> {
      return Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k));
    }));
  }
}
