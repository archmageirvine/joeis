package irvine.oeis.a250;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A250495 The n^n-th Fibonacci number.
 * @author Georg Fischer
 */
public class A250495 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.FIBONACCI.z(Z.valueOf(mN).pow(mN));
  }
}
