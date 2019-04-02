package irvine.oeis.a009;

import irvine.math.z.Z;
import irvine.oeis.a056.A056138;

/**
 * A009004 Ordered short legs of Pythagorean triangles.
 * @author Sean A. Irvine
 */
public class A009004 extends A056138 {

  private long mC = 0;
  private long mN = 0;

  @Override
  public Z next() {
    while (mC == 0) {
      mC = super.next().longValueExact();
      ++mN;
    }
    --mC;
    return Z.valueOf(mN);
  }
}
