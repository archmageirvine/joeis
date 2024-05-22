package irvine.oeis.a069;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a104.A104878;

/**
 * A069773.
 * @author Sean A. Irvine
 */
public class A069777 extends A104878 {

  @Override
  protected Z t(final int n, final int k) {
    return Integers.SINGLETON.product(k, n - 1, j -> super.t(j, k));
  }
}

