package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.a068.A068068;

/**
 * A020888.
 * @author Sean A. Irvine
 */
public class A020888 extends A068068 {

  private long mM = 0;

  @Override
  public Z next() {
    while (mM == 0) {
      mM = super.next().longValueExact();
    }
    --mM;
    return Z.valueOf(mN);
  }
}
