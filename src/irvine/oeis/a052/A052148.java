package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052148 Integers k &lt; (reversal of k) such that (reversal of k) + 1 is divisible by k-1.
 * @author Sean A. Irvine
 */
public class A052148 extends Sequence1 {

  private Z mN = Z.valueOf(11);

  @Override
  public Z next() {
    while (true) {
      final Z n1 = mN;
      mN = mN.add(1);
      final Z rev = Functions.REVERSE.z(mN);
      if (mN.compareTo(rev) < 0 && rev.add(1).mod(n1).isZero()) {
        return mN;
      }
    }
  }
}

