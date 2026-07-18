package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085944 Let S = 12345678901234567890123456..., the cyclic concatenation of digits; partition this string into distinct squarefree numbers. To avoid leading zeros, no member may end with the digit 9.
 * @author Sean A. Irvine
 */
public class A085944 extends Sequence0 {

  private final HashSet<Z> mUsed = new HashSet<>();
  private long mA = 0;

  @Override
  public Z next() {
    Z s = Z.ZERO;
    while (true) {
      if (++mA == 10) {
        mA = 0;
      }
      s = s.multiply(10).add(mA);
      if (mA != 9 && Predicates.SQUARE_FREE.is(s) && mUsed.add(s)) {
        return s;
      }
    }
  }
}
