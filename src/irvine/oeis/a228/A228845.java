package irvine.oeis.a228;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A228845 Least m such that (2k+1)*2^m + 1 is a prime factor of the Fermat number 2^(2^n) + 1.
 * @author Sean A. Irvine
 */
public class A228845 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long min = -1;
    for (final Z p : Jaguar.factor(Z.ONE.shiftLeft(1L << ++mN).add(1)).toZArray()) {
      final Z t = p.subtract(1);
      t.makeOdd();
      if (min < 0 || t.auxiliary() < min) {
        min = t.auxiliary();
      }
    }
    return Z.valueOf(min);
  }
}
