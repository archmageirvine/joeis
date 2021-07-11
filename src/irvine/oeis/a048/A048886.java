package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000203;
import irvine.oeis.a002.A002808;

/**
 * A048886 Numbers n such that sigma(n) = n-th composite number.
 * @author Sean A. Irvine
 */
public class A048886 extends A000203 {

  private final Sequence mComposites = new A002808();

  @Override
  public Z next() {
    while (true) {
      if (super.next().equals(mComposites.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

