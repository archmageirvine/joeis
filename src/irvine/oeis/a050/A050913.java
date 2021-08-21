package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a304.A304942;

/**
 * A050913 Pure 2-complexes on an infinite set of nodes with n multiple 2-simplexes. Also n-rowed binary matrices with all row sums 3, up to row and column permutation.
 * @author Sean A. Irvine
 */
public class A050913 extends A304942 {

  private int mN = -1;

  @Override
  public Z next() {
    return blocks(++mN, 3 * mN, 3);
  }
}
