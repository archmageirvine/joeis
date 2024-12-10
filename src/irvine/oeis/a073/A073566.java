package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a066.A066272;

/**
 * A073566 Numbers n such that n, n+1 and n+2 have the same number of anti-divisors.
 * @author Sean A. Irvine
 */
public class A073566 extends Sequence1 {

  private final DirectSequence mAnti = new A066272();
  private int mN = 18;

  @Override
  public Z next() {
    while (true) {
      final Z t = mAnti.a(++mN);
      if (t.equals(mAnti.a(mN + 1)) && t.equals(mAnti.a(mN + 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
