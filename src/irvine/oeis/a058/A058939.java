package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;

/**
 * A058939 The elliptic divisibility sequence associated to the rational point of smallest known global height for rational elliptic curves: the curve is [ 0,0,0,-412,3316 ] and the point is [ -18,70 ].
 * @author Sean A. Irvine
 */
public class A058939 extends MemorySequence {

  private static final long[] SMALL = {0, 1, 140, -1372000, -268912000000L};

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n < SMALL.length) {
      return Z.valueOf(SMALL[n]);
    }
    final int m = n / 2;
    if ((n & 1) == 1) {
      return a(m + 2).multiply(a(m).pow(3)).subtract(a(m - 1).multiply(a(m + 1).pow(3)));
    } else {
      return a(m + 2).multiply(a(m - 1).square()).subtract(a(m - 2).multiply(a(m + 1).square())).multiply(a(m)).divide(a(2));
    }
  }
}
