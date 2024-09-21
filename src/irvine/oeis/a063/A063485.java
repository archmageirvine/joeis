package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A063485 Composites of the form 2^(2^k)+3.
 * @author Sean A. Irvine
 */
public class A063485 extends Sequence0 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN >= 32) {
        throw new UnsupportedOperationException();
      }
      final Z t = Z.ONE.shiftLeft(1L << mN).add(3);
      if (!t.isProbablePrime()) {
        return t;
      }
    }
  }
}
