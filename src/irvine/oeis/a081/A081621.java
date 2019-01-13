package irvine.oeis.a081;

import irvine.math.plantri.Plantri;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A081621.
 * @author Sean A. Irvine
 */
public class A081621 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    if (++mN < 12) {
      return Z.ZERO;
    }
    return Z.valueOf(new Plantri().count(mN, 5, -1, -1, false, false, false, false));
  }

}

