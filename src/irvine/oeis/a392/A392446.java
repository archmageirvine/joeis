package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;

/**
 * A392446 Toroidal factorizations: row sums of A392445.
 * @author Sean A. Irvine
 */
public class A392446 extends A392445 {

  private int mN = 1;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, Functions.BIG_OMEGA.i(++mN), j -> super.next());
  }
}
