package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064494 Shotgun (or Schrotschuss) numbers: limit of the recursion B(k) =T[k](B(k-1)), where B(1) = (1,2,3,4,5,...) and T[k] is the Transformation that permutes the entries k(2i-1) and k(2i) for all positive integers i.
 * @author Sean A. Irvine
 */
public class A064494 extends Sequence1 {

  // After Peter Luschny

  private long mN = 0;

  private long divsign(final long s, final long k) {
    if (s % k != 0) {
      return 0;
    }
    return ((s / k) & 1) == 0 ? k : -k;
  }

  @Override
  public Z next() {
    long s = ++mN;
    for (long k = mN; k > 1; --k) {
      s -= divsign(s, k);
    }
    return Z.valueOf(s);
  }
}
