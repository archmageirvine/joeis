package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a304.A304942;

/**
 * A052172 Pure 3-multicomplexes on infinite set of nodes with n 3-simplexes.
 * @author Sean A. Irvine
 */
public class A058783 extends A304942 {

  private int mN = -1;

  @Override
  public Z next() {
    return blocks(++mN, 4 * mN, 4);
  }
}
