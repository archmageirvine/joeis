package irvine.oeis.a113;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A113204 Same as A007022, but with orientation-reversing isomorphisms forbidden.
 * @author Sean A. Irvine
 */
public class A113204 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    if (++mN < 8) {
      return Z.ZERO;
    }
    return Z.valueOf(new Plantri().count(mN, -1, -1, -1, true, false, true, false));
  }
}
