package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393132 Numbers k such that there is a reversible prime of the form 10^k - 5*10^m - 1.
 * @author Sean A. Irvine
 */
public class A393132 extends Sequence1 {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mT = mT.multiply(10);
      for (Z m = Z.FIVE; m.compareTo(mT) < 0; m = m.multiply(10)) {
        final Z candidate = mT.subtract(m).subtract(1);
        if (candidate.isProbablePrime() && Functions.REVERSE.z(candidate).isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
