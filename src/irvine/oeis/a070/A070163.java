package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070163 Primes arising in A070162(n).
 * @author Sean A. Irvine
 */
public class A070163 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      final Z t = Functions.COTOTIENT.z(++mN).subtract(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
