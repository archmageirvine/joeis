package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a052.A052217;

/**
 * A069522.
 * @author Sean A. Irvine
 */
public class A069522 extends Sequence1 implements Conjectural {

  private static final int HEURISTIC = 10000;
  private int mN = 0;
  private final DirectSequence mB = DirectSequence.create(new A052217());

  @Override
  public Z next() {
    ++mN;
    if (mN % 9 == 0 || mN % 11 == 0 || mN % 41 == 0 || mN % 73 == 0 || mN % 79 == 0 || mN % 101 == 0) {
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
