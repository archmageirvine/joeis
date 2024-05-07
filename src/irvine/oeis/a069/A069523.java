package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052218;

/**
 * A069523 Smallest multiple of n with digit sum = 4, or 0 if no such number exists, e.g. a(3k)= 0.
 * @author Sean A. Irvine
 */
public class A069523 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 10000;
  private int mN = 0;
  private final DirectSequence mB = DirectSequence.create(new A052218());

  @Override
  public Z next() {
    ++mN;
    if (mN % 3 == 0 || mN % 37 == 0 || mN % 41 == 0) {
      return Z.ZERO;
    }
    for (int k = 0; k < HEURISTIC * mN; ++k) {
      if (mB.a(k).mod(mN) == 0) {
        return mB.a(k);
      }
    }
    return Z.ZERO;
  }
}
