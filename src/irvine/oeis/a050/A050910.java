package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a304.A304942;

/**
 * A050910 Number of pure 3-complexes on 8 unlabeled nodes with n multiple 3-simplexes.
 * @author Sean A. Irvine
 */
public class A050910 extends A304942 {

  private int mN = -1;

  @Override
  public Z next() {
    return blocks(++mN, 8, 4);
  }
}
