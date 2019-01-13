package irvine.oeis.a000;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000109.
 * @author Sean A. Irvine
 */
public class A000109 implements Sequence {

  private int mN = 2;

  @Override
  public Z next() {
    if (++mN == 3) {
      return Z.ONE;
    }
    return Z.valueOf(new Plantri().count(mN, -1, -1, -1, false, false, false, false));
  }

}

