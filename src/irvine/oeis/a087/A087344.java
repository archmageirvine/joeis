package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087344 Smallest prime formed by concatenating n consecutive Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A087344 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long s = 0;
    while (true) {
      ++s;
      final StringBuilder sb = new StringBuilder();
      for (long k = 0, t = s; k < mN; ++k, ++t) {
        sb.append(Functions.FIBONACCI.z(t));
      }
      final Z concat = new Z(sb);
      if (concat.isProbablePrime()) {
        return concat;
      }
    }
  }
}

