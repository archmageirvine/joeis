package irvine.oeis.a065;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065255 Consider the sequence b(k) such that b(k) and sigma(b(k)) end with the same digit in base 10. Sequence gives values of n such that b(n)/n = 10.
 * @author Sean A. Irvine
 */
public class A065255 extends Sequence1 {

  private long mM = 0;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (Jaguar.factor(++mM).sigma().mod(10) == (mM % 10)) {
        if (mM == 10 * mN) {
          return Z.valueOf(mM);
        }
        ++mN;
      }
    }
  }
}
