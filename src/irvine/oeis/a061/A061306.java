package irvine.oeis.a061;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061306 a(n) = B(B(n)), where B() are the Bell numbers, A000110.
 * @author Sean A. Irvine
 */
public class A061306 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Functions.BELL.z(Functions.BELL.z(++mN));
  }
}
