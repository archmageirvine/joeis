package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a133.A133687;

/**
 * A000516 Number of equivalence classes of n X n matrices over {0,1} with rows and columns summing to 5, where equivalence is defined by row and column permutations. Isomorphism classes of bicolored 5-regular bipartite graphs, where isomorphism cannot exchange the colors.
 * @author Sean A. Irvine
 */
public class A000516 extends A133687 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 5));
  }
}
