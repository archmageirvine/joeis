package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.a304.A304942;

/**
 * A050912 Number of pure 2-complexes on 7 unlabeled nodes with n multiple 2-simplexes.
 * @author Sean A. Irvine
 */
public class A050912 extends A304942 {

  private int mN = -1;

  @Override
  public Z next() {
    return blocks(++mN, 7, 3);
  }
}
