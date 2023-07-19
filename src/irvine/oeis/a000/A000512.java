package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a133.A133687;

/**
 * A000512 Number of equivalence classes of n X n matrices over {0,1} with rows and columns summing to 3, where equivalence is defined by row and column permutations.
 * @author Sean A. Irvine
 */
public class A000512 extends A133687 {

  /** Construct the sequence. */
  public A000512() {
    super(1);
  }

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 3));
  }
}
