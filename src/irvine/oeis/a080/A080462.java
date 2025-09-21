package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080454.
 * @author Sean A. Irvine
 */
public class A080462 extends Sequence1 {

  private long mN = 0;

  private long f(final long n) {
    return n / Functions.DIGIT_SUM.l(n);
  }

  @Override
  public Z next() {
    long m = ++mN;
    long c = 1;
    while (m % Functions.DIGIT_SUM.l(m) != 0) {
      m = f(m);
      ++c;
    }
    return Z.valueOf(c);
  }
}

