package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001694;

/**
 * A085257 Number of ways to write n as sum of a powerful and a squarefree number.
 * @author Sean A. Irvine
 */
public class A085257 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.create(new A001694());
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1, t; (t = mN - mA.a(k).longValue()) > 0; ++k) {
      if (Predicates.SQUARE_FREE.is(t)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
