package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A047830 Least number which becomes prime after exactly n iterations of f(x) = sum of prime factors of x.
 * @author Sean A. Irvine
 */
public class A047830 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.TWO;
    }
    return new A047820() {
      @Override
      protected int iterations() {
        return mN;
      }
    }.next();
  }
}
