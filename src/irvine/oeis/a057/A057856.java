package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057853.
 * @author Sean A. Irvine
 */
public class A057856 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z n1 = Z.valueOf(mN + 1);
    long k = 0;
    while (true) {
      final Z s = n1.pow(1L << k).add(n.pow(1L << k));
      if (s.isProbablePrime()) {
        return Z.valueOf(1L << k);
      }
      ++k;
    }
  }
}
