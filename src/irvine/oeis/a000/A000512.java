package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a133.A133687;

/**
 * A000512 Number of equivalence classes of <code>n X n</code> matrices over <code>{0,1}</code> with rows and columns summing to 3, where equivalence is defined by row and column permutations.
 * @author Sean A. Irvine
 */
public class A000512 extends A133687 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 3));
  }
}
