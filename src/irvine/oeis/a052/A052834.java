package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052834 a(n) = Bell(n+1)-Bell(n)-1, n&gt;0.
 * @author Sean A. Irvine
 */
public class A052834 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final int index = ++mN + 1;
    return Functions.BELL.z(index).subtract(Functions.BELL.z(mN)).subtract(1).max(Z.ZERO);
  }
}

