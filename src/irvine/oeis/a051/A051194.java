package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051194 Triangular array T read by rows: T(n,k) = number of positive integers that divide both n and k.
 * @author Sean A. Irvine
 */
public class A051194 implements Sequence {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    long c = 1;
    for (long k = 2; k <= mM; ++k) {
      if (mM % k == 0 && mN % k == 0) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
