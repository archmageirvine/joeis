package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073081 Greatest k such that k! divides sigma(n!).
 * @author Sean A. Irvine
 */
public class A073081 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z s = Functions.SIGMA1.z(Functions.FACTORIAL.z(++mN));
    long k = 1;
    while (true) {
      if (!s.mod(Functions.FACTORIAL.z(++k)).isZero()) {
        return Z.valueOf(k - 1);
      }
    }
  }
}
