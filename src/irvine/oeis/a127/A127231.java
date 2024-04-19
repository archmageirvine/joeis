package irvine.oeis.a127;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A127231 a(n) = (2n)! + 1.
 * @author Georg Fischer
 */
public class A127231 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int n = ++mN * 2;
    return Functions.FACTORIAL.z(n).add(1);
  }
}
