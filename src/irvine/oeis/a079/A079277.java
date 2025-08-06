package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A079277 Largest integer k &lt; n such that any prime factor of k is also a prime factor of n.
 * @author Sean A. Irvine
 */
public class A079277 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final long rad = Functions.RAD.l(++mN);
    long k = mN;
    while (true) {
      if (Functions.RAD.l(--k * mN) == rad) {
        return Z.valueOf(k);
      }
    }
  }
}
