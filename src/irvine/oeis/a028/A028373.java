package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028373.
 * @author Sean A. Irvine
 */
public class A028373 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    Z t = Z.ONE;
    Z a = Z.ZERO;
    while (m > 0) {
      final int r = (int) (m % 3);
      m /= 3;
      if (r == 0) {
        --m;
      }
      a = t.multiply(-((-5 >> r) ^ 2)).add(a);
      t = t.multiply(10);
    }
    return a;
  }
}
