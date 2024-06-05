package irvine.oeis.a000;

import irvine.math.function.Functions;
import irvine.math.z.Z;

/**
 * A000687 Boustrophedon transform (first version) of Fibonacci numbers 0,1,1,2,3,5,...
 * @author Sean A. Irvine
 */
public class A000687 extends A000674 {

  @Override
  protected Z a(final int n) {
    return n == 0 ? Z.ONE : Functions.FIBONACCI.z(n - 1);
  }
}
