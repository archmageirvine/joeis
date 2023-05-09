package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063719 Numbers n such that usigma(cototient(n)) is a prime.
 * @author Sean A. Irvine
 */
public class A063720 extends Sequence0 {

  private static final long[] SEGMENTS = {6, 2, 5, 5, 4, 5, 5, 3, 7, 5};
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long sum = 0;
    do {
      sum += SEGMENTS[(int) (m % 10)];
      m /= 10;
    } while (m != 0);
    return Z.valueOf(sum);
  }
}

