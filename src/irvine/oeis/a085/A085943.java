package irvine.oeis.a085;

import java.util.HashSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a033.A033307;

/**
 * A085943 Let S = 123456789101112131415..., the concatenation of the natural numbers; partition this string into distinct squarefree numbers. To avoid leading zeros, no number may end at the digit that comes before a 0 in S.
 * @author Sean A. Irvine
 */
public class A085943 extends Sequence0 {

  private final Sequence mS = new A033307();
  private final HashSet<Z> mUsed = new HashSet<>();
  private Z mA = mS.next();

  @Override
  public Z next() {
    Z s = Z.ZERO;
    while (true) {
      s = s.multiply(10).add(mA);
      mA = mS.next();
      if (!mA.isZero() && Predicates.SQUARE_FREE.is(s) && mUsed.add(s)) {
        return s;
      }
    }
  }
}
