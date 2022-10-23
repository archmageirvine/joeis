package irvine.oeis.a050;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050412 Riesel problem: start with n; repeatedly double and add 1 until reaching a prime. Sequence gives number of steps to reach a prime or 0 if no prime is ever reached.
 * @author Sean A. Irvine
 */
public class A050412 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z t = Z.valueOf(++mN);
    long count = 0;
    do {
      t = t.multiply2().add(1);
      ++count;
    } while (!t.isProbablePrime());
    return Z.valueOf(count);
  }
}
