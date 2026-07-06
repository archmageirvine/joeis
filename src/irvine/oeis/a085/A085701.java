package irvine.oeis.a085;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085701 Smallest multiple of n such that a(n) + a(n-1) is a squarefree number.
 * @author Sean A. Irvine
 */
public class A085701 extends Sequence1 {

  private long mA = 0;
  private long mN = 0;

  @Override
  public Z next() {
    if (mN == 319) {
      return null;
    }
    long m = ++mN;
    while (!Predicates.SQUARE_FREE.is(mA + m)) {
      m += mN;
    }
    mA = m;
    return Z.valueOf(m);
  }
}
