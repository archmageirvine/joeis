package irvine.oeis.a382;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033676;

/**
 * A382286 a(n) is the least k such that floor(sqrt(n*k/d(n*k))) = floor(sqrt(d(n*k))), where d(k) is the largest divisor of k which is &lt;= sqrt(k).
 * @author Sean A. Irvine
 */
public class A382286 extends Sequence1 {

  private final DirectSequence mD = new A033676();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final long d = mD.a(mN * ++k).longValueExact();
      if (Functions.SQRT.l(mN * k / d) == Functions.SQRT.l(d)) {
        return Z.valueOf(k);
      }
    }
  }
}
