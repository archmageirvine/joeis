package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.a133.A133687;

/**
 * A000513 Number of equivalence classes of n X n matrices over {0,1} with rows and columns summing to 4, where equivalence is defined by row and column permutations. Also number of isomorphism classes of bicolored quartic bipartite graphs, where isomorphism cannot exchange the colors.
 * @author Sean A. Irvine
 */
public class A000513 extends A133687 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(get(++mN, 4));
  }
}
