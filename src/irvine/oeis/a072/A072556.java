package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000045;

/**
 * A072542.
 * @author Sean A. Irvine
 */
public class A072556 extends Sequence1 {

  private final Sequence mFibo = new A000045().skip();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(mFibo.next()) == Functions.OMEGA.i(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
