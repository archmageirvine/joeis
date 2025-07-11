package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078677 Write n in binary; repeatedly sum the "digits" until reaching 1; a(n) = sum of these sums (including '1' and n itself).
 * @author Sean A. Irvine
 */
public class A078677 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 1;
    while (m != 1) {
      sum += m;
      m = Long.bitCount(m);
    }
    return Z.valueOf(sum);
  }
}

