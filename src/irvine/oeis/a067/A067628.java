package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067628 Minimal perimeter of polyiamond with n triangles.
 * @author Sean A. Irvine
 */
public class A067628 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final long m = 6 * ++mN;
    long c = Functions.SQRT.l(m);
    if (c * c < m) {
      ++c;
    }
    return Z.valueOf((c & 1) == (mN & 1) ? c : c + 1);
  }
}
