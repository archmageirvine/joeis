package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054055 Largest digit of n.
 * @author Sean A. Irvine
 */
public class A054055 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long max = 0;
    while (m != 0 && max != 9) {
      final long r = m % 10;
      m /= 10;
      if (r > max) {
        max = r;
      }
    }
    return Z.valueOf(max);
  }
}
